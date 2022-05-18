import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

         VersionControlSystem versionControlSystem=new VersionControlSystem();
         File file=new File("continut1","fisier1",1);
         SnaphotFile snaphotFile=file.createSnaphot();
         versionControlSystem.addSnaphot(snaphotFile);
         versionControlSystem.printSnaphotList();
         file.setContinut("continut2");
         file.print();
         versionControlSystem.printSnaphotList();
         file.restoreFileContent(versionControlSystem.getSnaphot(1234));
         file.print();
    }
}
