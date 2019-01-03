package ys.springcloud.base;

public class BaseApiService {
    public ResponseBase setResultError(Integer code,String msg){
        return setResult(code,msg,null);
    }
    public ResponseBase setResultError(String msg){
        return setResult(500,msg,null);
    }

    public ResponseBase setResultSuccess(Object data){
        return setResult(200,"处理成功",data);
    }
    public ResponseBase setResultSuccess(){
        return setResult(200,"处理成功",null);
    }
    public ResponseBase setResultSuccess(String msg){
        return setResult(200,msg,null);
    }
    private ResponseBase setResult(Integer code,String msg,Object data) {
        return new ResponseBase(code,msg,data);
    }
}
