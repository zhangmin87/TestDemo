package org.common.exception;

import framework.service.ServiceException;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 业务异常
 *   当一个业务异常发生时，用户必须提供一个错误代码。
 * </p>
 *
 * @author summerx
 * @Date 2016-12-25 4:59 PM
 */
public class BizLogicException extends ServiceException {

    public static final String UNKNOWN_ERRCD = "-1";
    public static final String UNKNOWN_ERRTX =  "an unexpected error occurred";

    private String errorCode = UNKNOWN_ERRCD;
    private String errorMessage;
    private List<String> actionErrors = new ArrayList<String>();

    public BizLogicException() {
        this(UNKNOWN_ERRCD, UNKNOWN_ERRTX);
    }
    public BizLogicException(String errorMessage) {
        this(UNKNOWN_ERRCD, errorMessage);
    }
    public BizLogicException(String errorCode, String errorMessage) {
        this(errorCode, errorMessage, (Throwable) null);
    }
    public BizLogicException(String errorMessage, Throwable th) {
        this(UNKNOWN_ERRCD, errorMessage, th);
    }
    public BizLogicException(String errorCode, String errorMessage, Throwable th) {
        super(errorMessage, th);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BizLogicException addActionError(String actionError) {
        actionErrors.add(actionError);
        return this;
    }

    public BizLogicException addActionErrors(List<String> actionErrors) {
        actionErrors.addAll(actionErrors);
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public List<String> getActionErrors() {
        return actionErrors;
    }
}
