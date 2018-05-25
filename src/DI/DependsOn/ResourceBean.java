package DI.DependsOn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceBean {
    private FileOutputStream fos;
    private File file;

    //init method
    public void init() {
        System.out.println("ResourceBean: init");
        //where to load some resources
        System.out.println("ResourceBean: do sth with resources");
        try {
            this.fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //destroy method
    public void destroy() {
        System.out.println("ResourceBean: destroy");
        //where to release the resources
        System.out.println("ResourceBean: released resources, cleaned up");
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FileOutputStream getFos() {
        return fos;
    }
    public void setFile(File file) {
        this.file = file;
    }
}
