import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[6];
        nhanvien[0] = new NhanVienFulltime("NV1","An",23,1000990,"an@gmail.com",15000000,500000,200000);
        nhanvien[1] = new NhanVienFulltime("NV2","Lan",34,106790,"lan@gmail.com",16000000,600000,400000);
        nhanvien[2] = new NhanVienFulltime("NV3","Ha",26,1088690,"Ha@gmail.com",12000000,200000,100000);
        nhanvien[3] = new NhanVienParttime("NVP1","Tuan",25,9912321,"tuan@gmail.com",30);
        nhanvien[4] = new NhanVienParttime("NVP2","Hung",27,3423422,"Hung@gmail.com",35);
        nhanvien[5] = new NhanVienParttime("NVP3","Tu",30,234233,"Tu@gmail.com",32);

        int avgIncome = getAvgIncome(nhanvien);
        System.out.println("The average income is " + avgIncome);

        getNvHaveHigherIncomeThanAvg(nhanvien, avgIncome);

        getSumIncomeParttime(nhanvien);

        NhanVienFulltime[] fulltimes = new NhanVienFulltime[3];
        fulltimes[0]= (NhanVienFulltime) nhanvien[0];
        fulltimes[1]= (NhanVienFulltime) nhanvien[1];
        fulltimes[2]= (NhanVienFulltime) nhanvien[2];

        sortFultime(fulltimes);

    }

    private static void sortFultime(NhanVienFulltime[] fulltimes) {
        Arrays.sort(fulltimes,Comparator.comparing(NhanVienFulltime::getIncome));
        for (int i = 0; i < fulltimes.length; i++) {
            System.out.println(fulltimes[i]);
        }
    }

    private static void getSumIncomeParttime(NhanVien[] nhanvien) {
        int sumIncomeParttime = 0;
        for (NhanVien nv : nhanvien) {
            if(nv instanceof NhanVienParttime) {
                sumIncomeParttime+=((NhanVienParttime)nv).getIncome();
            }
        }
        System.out.println("The average income is " + sumIncomeParttime);
    }

    private static void getNvHaveHigherIncomeThanAvg(NhanVien[] nhanvien, int avgIncome) {
        for (NhanVien nv : nhanvien) {
            if(nv instanceof NhanVienFulltime) {
                NhanVienFulltime nvFulltime = (NhanVienFulltime) nv;
                if (nvFulltime.getIncome()> avgIncome) {
                    System.out.println(nvFulltime);
                }
            }
        }
    }

    private static int getAvgIncome(NhanVien[] nhanvien) {
        int sumIncome = 0;
        for(NhanVien nv : nhanvien) {
            sumIncome+= nv.getIncome();
        }
        int avgIncome = sumIncome / nhanvien.length;
        return avgIncome;
    }
}