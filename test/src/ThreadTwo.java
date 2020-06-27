class Stack{
    int idx = 0;
    char data[] = new char[6];
    public void push(char c){
        data[idx] = c;
        idx ++;
    }

    public char pop(){
        idx --;
        return data[idx];
    }
}



public class ThreadTwo {
    public static void main(String[] args){
        Stack t = new Stack();
        t.push('c');
        t.pop();
        System.out.println(t.pop());

    }
}
