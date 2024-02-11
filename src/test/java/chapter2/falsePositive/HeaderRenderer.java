package chapter2.falsePositive;

public class HeaderRenderer implements IRenderer {
    @Override
    public String render(Message message) {
        return "<h1>" + message.getHeader() + "</h1>";
    }
}
