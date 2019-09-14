package Decorator;

public class SideBorder extends Border {

    private char borderChar;

    public SideBorder (Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }
    @Override
    public int getColumns() {

        // ここがキモ。親クラスのメソッドを加工して出力（デコレート）している。
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {

        //デコレートしているメソッドと、そうではないメソッドがある。
        //ここはデコレートしていない（親クラスの実装をそのまま使う）場合。
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        //ここもデコレート部分。
        return borderChar + display.getRowText(row) + borderChar;
    }
}
