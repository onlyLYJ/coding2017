package dp.builder;

public class TagBuilder {

    private TagNode root;
    private TagNode currNode;
    private TagNode parentNode;

    public TagBuilder(String rootTagName) {
        root = new TagNode(rootTagName);
        currNode = root;
    }

    public TagBuilder addChild(String childTagName) {

        TagNode node = new TagNode(childTagName);
        currNode.add(node);
        parentNode = currNode;
        currNode = node;

        return this;
    }

    public TagBuilder addSibling(String siblingTagName) {

        TagNode node = new TagNode(siblingTagName);
        parentNode.add(node);
        currNode = node;
        return this;

    }

    public TagBuilder setAttribute(String name, String value) {

        currNode.setAttribute(name, value);
        return this;
    }

    public TagBuilder setText(String value) {

        currNode.setValue(value);
        return this;
    }

    public String toXML() {
        return root.toXML();
    }
}
