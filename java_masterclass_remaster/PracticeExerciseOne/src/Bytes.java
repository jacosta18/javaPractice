public class Bytes {
    public static void printMegaBytesAndKiloBytes (int number) {
        int KB, XX,kbleft;
        KB=number;
        XX=KB/1024;
        kbleft=KB%1024;
        if (KB<0){
            System.out.println("Invalid Value");
        }else
            System.out.println(KB +" KB = "+ XX + " MB and "+ kbleft + " KB");
    }
}
