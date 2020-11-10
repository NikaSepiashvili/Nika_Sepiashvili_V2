import java.io.File;
import java.io.FilenameFilter;

public class Working{
    public String[] GetFileNames(String word) {
        File file = new File("C:\\Users\\user\\Desktop\\რესურსები\\BTU_DOCUMENT");
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                String searchKey = word;

                if (name.toUpperCase().contains(searchKey.toUpperCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        return fileNames;
    }
    public int GetCount(){
        File file = new File("C:\\Users\\user\\Desktop\\რესურსები\\BTU_DOCUMENT");
        return (int) file.list().length;
    }
}