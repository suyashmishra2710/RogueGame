
public class Action {
    protected String msg;
    protected int intVal;
    protected String charVal;
    
    public Action(){
        System.out.println("New Action Created");
    }
    public void setMessage(String _msg){
        msg = _msg;
        System.out.println("Message is " + msg);
    }

    public void setIntValue(int v){
        intVal = v;
        System.out.println("Int value is " + intVal);
    }

    public void setCharValue(String c){
        charVal = c;
        System.out.println("Char value is " + charVal);
    }
}
