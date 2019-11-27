package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private static Date moment = new Date();
	private OrderStatus status;
	private Client client;
	private double valorOrdem = 0;

	private List<OrderItem> item = new ArrayList<OrderItem>();

	public Order() {

	}

	public Order(Client client, OrderStatus status) {
		this.client = client;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getMoment() {
		return sdf.format(moment);
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return item;
	}

	public void addItem(OrderItem i) {
		item.add(i);
	}

	public void removeItem(OrderItem i) {
		item.remove(i);
	}
	
	public double getValorOrdem() {
		return valorOrdem;
	}

	public void addValorOrdem(double valorOrdem) {
		this.valorOrdem += valorOrdem;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem:\n");
		sb.append("Hora da ordem: " + sdf2.format(moment) + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + client.getName() + " " + sdf.format(client.getBirthDay()) + " " + client.getEmail() + "\n");
		
		sb.append("Itens da ordem: \n");
		for (OrderItem orderItem : item) {
			sb.append(orderItem.toString() + "\n");
		}
		
		sb.append(String.format("%.2f", getValorOrdem()));
		
		return sb.toString();
	}
	
}
