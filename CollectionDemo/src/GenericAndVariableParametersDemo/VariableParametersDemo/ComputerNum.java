package GenericAndVariableParametersDemo.VariableParametersDemo;

public class ComputerNum {
    public Integer compute(int... a){
        Integer n = 0;
        for (int i : a){
            n = n+i;
        }
        return n;
    }
}
