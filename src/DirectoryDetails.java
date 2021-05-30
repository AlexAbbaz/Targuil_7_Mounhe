import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    private List<FileDetails> files;

    public DirectoryDetails(String path, String name){
        super(path,name);
        this.files = new ArrayList<>();
    }

    public void addFile(FileDetails fileDetails){
        files.add(fileDetails);
    }

    public void removeFile(FileDetails fileDetails) {
        files.remove(fileDetails);
    }

    @Override
    public void accept(FileDetailsVisitor fileDetailsVisitor) {
        for (FileDetails item: files) {
            item.accept(fileDetailsVisitor);
        }
        fileDetailsVisitor.visit(this);
    }
}