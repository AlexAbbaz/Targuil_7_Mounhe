public class SizeCalculation implements FileDetailsVisitor{
    private int size = 0;
    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        size += docxFileDetails.getSize();
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        size += htmlFileDetails.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        size += jpgFileDetails.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        size += mp3FileDetails.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        size += pptxFileDetails.getSize();
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        size += txtFileDetails.getSize();
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }

    public void print() {
        System.out.println("the total size is " + size + " bytes");
    }
}
