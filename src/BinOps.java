public class BinOps {


    public String sum(String a, String b) {
        String resultSum;
        resultSum = Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        return resultSum;
    }


    public String mult(String a, String b) {
        String resultMult;
        resultMult = Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
        return resultMult;
    }
}