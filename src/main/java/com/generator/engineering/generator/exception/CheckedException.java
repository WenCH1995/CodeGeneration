package com.generator.engineering.generator.exception;

import lombok.NoArgsConstructor;

/**
 * <p>
 * 异常处理
 * </p>
 *
 * @author wench
 * @since 2020-12-11
 */
@NoArgsConstructor
public class CheckedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CheckedException(String message) {
		super(message);
	}

	public CheckedException(Throwable cause) {
		super(cause);
	}

	public CheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
