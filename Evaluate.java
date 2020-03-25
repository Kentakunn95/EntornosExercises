package com.gmq.entornos.refactoring.exercice;

/**
 * 
 * Dada la siguiente clase:
 * 
 * 1.- Lee el código y crea los tests de junit necesarios 1.1.- Sigue las
 * indicaciones de la asignatura buscando la máxima cobertura posible
 * 
 * 2.- Realiza las correcciones que veas necesarias para mejorar la calidad del
 * código. 2.1.- Añade un comentario en el código explicando el cambio que
 * has realizado
 * 
 * @author Raul.Camarero
 *
 */
public class Evaluate {

	private String id;
	private String name;
	private String evaluations[];

	public Evaluate(String id, String name) {
		this.id = id;
		this.name = name;
		this.evaluations = new String[69];
	}

	public Evaluate(String id, String name, String[] evaluations) {
		this.id = id;
		this.name = name;
		this.evaluations = evaluations;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String[] getEvaluations() {
		return evaluations;
	}

	public String evaluatePupil(int value) {
		String annotation = "No funciona";
		if (value > 10) {
			throw new RuntimeException("La nota no es válida. Nadie saca más de 10!!!");
		} else if (value < 5) {
			annotation = "SUSPENSO";
		} else {
			if (value >= 5 && value <= 6) {
				annotation = "GOOD";
			} else {
				if (value <= 10 && value >= 9) {
					annotation = "SOBRESALIENTE";
				} else {
					if (value < 9 && value >= 8) {
						annotation = "NOTABLE";
					} else
						annotation = "BIEN";
				}
			}
			
			for (int i = 0; i < evaluations.length; i++) {
				if (evaluations[i] == null) {
					evaluations[i] = annotation;
					System.out
							.println("Añadir al alumno " + name + "(" + id + ") la nota " + evaluations[i].toString());
					break;
				}
			}
		}
		return annotation;
	}
}
