public class stack{
    int num[]=new int[100];
    int top=0;

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==99){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int val){
        if(!isFull()){
            num[top]=val;
            top++;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            return num[top--];
        }
        else{
            System.out.println("Stack is Empty");
            return 0;
        }
    }

    public static void main(String args[]){
        stack num1 = new stack();
        num1.push(1);
        num1.push(6);
        num1.push(5);
        num1.pop();
    }
}
