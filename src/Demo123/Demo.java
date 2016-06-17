package Demo123;

/**
 * Created by Archer on 2016/6/17.
 */
public class Demo {
    public static void main(String[] args) {
        try {
            ModifyOffset instance = ModifyOffset.getInstance(ModifyOffset.class.getResourceAsStream("axisoffset.dat"));

            PointDouble pointDouble = instance.s2c(new PointDouble(102.85356810243228, 24.82749745615166));//标准坐标
            System.out.println(pointDouble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
