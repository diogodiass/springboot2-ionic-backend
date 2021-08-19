package com.diogoamorim.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StanderError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}

}
