package per.gyx.hongyistore.common;

import java.io.Serializable;

public class Result<T> implements Serializable {
    //序列号
    private static final long serialVersionUID = 1L;
    //业务码 成功 失败 权限不足
    private int resultCode;
    //返回提示信息
    private String message;
    //数据结果
    private T data;

    public Result() {
    }
    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }
    public Result failure(String code){
        return new Result(500,"服务错误");
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString(){
        return "Result{"+
                "resultCode=" + resultCode +
                ",message=" + message + '\'' +
                ",data=" + data +
                '}';
    }
}
