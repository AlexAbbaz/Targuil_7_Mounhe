public class Counter implements FileDetailsVisitor{
    private int count = 0;

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        this.count += 1;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {}

    public void print() {
        System.out.println("Found " + count + " files");
    }

    public int getCount() {
        return this.count;
    }


}
