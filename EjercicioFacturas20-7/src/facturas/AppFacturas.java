package facturas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 
 * ADA Backend7
 * 
 * @author Gala Jazmin Alemanni 18 oct. 2021 - 10:56:58
 *
 */

public class AppFacturas {

	private static final int TOTAL_FACTURAS = 10;
	private static final String CLIENTES = "ABCDE";

	public static void main(String[] args) {

		List<Factura> facturas = new ArrayList<Factura>();
		Set<String> clientesMas1000 = new HashSet<>();
		for (int i = 0; i < TOTAL_FACTURAS; i++) {
			facturas.add(generarFactura(i + 1));
		}
		for (int i = 0; i < TOTAL_FACTURAS; i++) {
			if (facturas.get(i).getImporte() >= 1000) {
				clientesMas1000.add(facturas.get(i).getCliente());
			}
		}
		facturas.forEach(fac -> {
			System.out.println(fac.getNumero() + " - " + fac.getCliente() + ": " + fac.getImporte());
		});

		for (String cliente : clientesMas1000) {
			System.out.println(cliente);
		}

	}

	private static Factura generarFactura(int numero) {
		String cliente = generarCliente();
		Float importe = generarImporte();
		Factura factura = new Factura(cliente, importe, numero);

		return factura;
	}

	private static Float generarImporte() {
		Random random = new Random();
		int importe = random.nextInt(1500 + 1) + 500;
		float dec = random.nextFloat();
		return importe + dec;
	}

	private static String generarCliente() {
		Random random = new Random();
		int pos = random.nextInt(4 + 1);
		return String.valueOf(CLIENTES.charAt(pos));
	}

}
