package utils;

import models.Usuario;

public class Test {

	public static void main(String[] args) {
		for (Usuario user : Almacen.usuarios) {
			System.out.println(user);
		}
	}

}
