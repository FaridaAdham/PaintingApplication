package paint;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XML11Serializer;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class SaveLoad {

    public void save(String filepath, ArrayList<Shape> list) throws ParserConfigurationException, FileNotFoundException, IOException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();
        Document xmlDocument = builder.newDocument();
        Element root = xmlDocument.createElement("Shapes");

        for (Shape shape : list) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                Element circ = xmlDocument.createElement("Circle");
                Element x1 = xmlDocument.createElement("X");
                Element y1 = xmlDocument.createElement("Y");
                Element Rad = xmlDocument.createElement("Radius");

                Element r = xmlDocument.createElement("Red");
                Element g = xmlDocument.createElement("Green");
                Element b = xmlDocument.createElement("Blue");
                Element s = xmlDocument.createElement("Stroke");
                
                Text redVal = xmlDocument.createTextNode(c.getColor().getRed() + "");
                Text greenVal = xmlDocument.createTextNode(c.getColor().getGreen() + "");
                Text blueVal = xmlDocument.createTextNode(c.getColor().getBlue() + "");
                Text str= xmlDocument.createTextNode(c.getStroke() + "");

                r.appendChild(redVal);
                g.appendChild(greenVal);
                b.appendChild(blueVal); 
                s.appendChild(str);

                Text xVal = xmlDocument.createTextNode(c.getX() + "");
                Text yVal = xmlDocument.createTextNode(c.getY() + "");
                Text radius = xmlDocument.createTextNode(c.getRadius() + "");
                x1.appendChild(xVal);
                y1.appendChild(yVal);
                Rad.appendChild(radius);
                
               
                circ.appendChild(x1);
                circ.appendChild(y1);
                circ.appendChild(Rad);
                circ.appendChild(r);
                circ.appendChild(g);
                circ.appendChild(b);
                circ.appendChild(s);
                
                root.appendChild(circ);
            } else if (shape instanceof Rectangle) {
                Rectangle re = (Rectangle) shape;
                Element rect = xmlDocument.createElement("Rectangle");
                Element x = xmlDocument.createElement("X");
                Element y = xmlDocument.createElement("Y");
                Element width = xmlDocument.createElement("Width");
                Element length = xmlDocument.createElement("Length");

                Element r = xmlDocument.createElement("Red");
                Element g = xmlDocument.createElement("Green");
                Element b = xmlDocument.createElement("Blue");
                Element s = xmlDocument.createElement("Stroke");
                
                Text redVal = xmlDocument.createTextNode(re.getColor().getRed() + "");
                Text greenVal = xmlDocument.createTextNode(re.getColor().getGreen() + "");
                Text blueVal = xmlDocument.createTextNode(re.getColor().getBlue() + "");
                Text str= xmlDocument.createTextNode(re.getStroke() + "");

                r.appendChild(redVal);
                g.appendChild(greenVal);
                b.appendChild(blueVal);
                s.appendChild(str);
                Text x1 = xmlDocument.createTextNode(re.getX() + "");
                Text y1 = xmlDocument.createTextNode(re.getY() + "");
                Text width1 = xmlDocument.createTextNode(re.getWidth() + "");
                Text length1 = xmlDocument.createTextNode(re.getLength() + "");
                x.appendChild(x1);
                y.appendChild(y1);
                width.appendChild(width1);
                length.appendChild(length1);
                
                rect.appendChild(x);
                rect.appendChild(y);
                rect.appendChild(width);
                rect.appendChild(length);
                rect.appendChild(r);
                rect.appendChild(g);
                rect.appendChild(b);
                rect.appendChild(s);
               
                root.appendChild(rect);
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                Element sq = xmlDocument.createElement("Square");
                Element X = xmlDocument.createElement("X");
                Element Y = xmlDocument.createElement("Y");
                Element Side = xmlDocument.createElement("Side");
               

                Element r = xmlDocument.createElement("red");
                Element g = xmlDocument.createElement("green");
                Element b = xmlDocument.createElement("blue");
                Element st = xmlDocument.createElement("Stroke");
                Text redVal = xmlDocument.createTextNode(s.getColor().getRed() + "");
                Text greenVal = xmlDocument.createTextNode(s.getColor().getGreen() + "");
                Text blueVal = xmlDocument.createTextNode(s.getColor().getBlue() + "");
                Text str= xmlDocument.createTextNode(s.getStroke() + "");

                r.appendChild(redVal);
                g.appendChild(greenVal);
                b.appendChild(blueVal);
                st.appendChild(str);
                Text x = xmlDocument.createTextNode(s.getX() + "");
                Text y = xmlDocument.createTextNode(s.getY() + "");
                Text side = xmlDocument.createTextNode(s.getSide() + "");
               
                X.appendChild(X);
                Y.appendChild(Y);
                Side.appendChild(side);
                
               
                sq.appendChild(X);
                sq.appendChild(Y);
                sq.appendChild(Side);
                
                sq.appendChild(r);
                sq.appendChild(g);
                sq.appendChild(b);
                sq.appendChild(st);
                
                root.appendChild(sq);
            } else if (shape instanceof Oval) {
                Oval e = (Oval) shape;
                Element el = xmlDocument.createElement("Oval");
                Element X = xmlDocument.createElement("X");
                Element Y = xmlDocument.createElement("Y");
                Element RH = xmlDocument.createElement("RH");
                Element RV = xmlDocument.createElement("RV");

                Element r = xmlDocument.createElement("Red");
                Element g = xmlDocument.createElement("Green");
                Element b = xmlDocument.createElement("Blue");
                Element s = xmlDocument.createElement("Stroke");
                Text redVal = xmlDocument.createTextNode(e.getColor().getRed() + "");
                Text greenVal = xmlDocument.createTextNode(e.getColor().getGreen() + "");
                Text blueVal = xmlDocument.createTextNode(e.getColor().getBlue() + "");
                Text str= xmlDocument.createTextNode(e.getStroke() + "");

                r.appendChild(redVal);
                g.appendChild(greenVal);
                b.appendChild(blueVal);
                s.appendChild(str);
                
                Text x = xmlDocument.createTextNode(e.getX() + "");
                Text y = xmlDocument.createTextNode(e.getY() + "");
                Text rh = xmlDocument.createTextNode(e.getH_radius() + "");
                Text rv = xmlDocument.createTextNode(e.getV_radius() + "");
                X.appendChild(x);
                Y.appendChild(y);
                RH.appendChild(rh);
                RV.appendChild(rv);
                
              
                el.appendChild(X);
                el.appendChild(Y);
                el.appendChild(RH);
                el.appendChild(RV);
                el.appendChild(r);
                el.appendChild(g);
                el.appendChild(b);
                el.appendChild(s);
                
                root.appendChild(el);
            }         }
        xmlDocument.appendChild(root);
        OutputFormat f = new OutputFormat(xmlDocument);
        f.setIndenting(true);
        File xmlf = new File(filepath);
        FileOutputStream fos = new FileOutputStream(xmlf);
        XMLSerializer ser = new XML11Serializer(fos, f);
        ser.serialize(xmlDocument);
    }

    public ArrayList<Shape> load(String filepath) throws SAXException, ParserConfigurationException, IOException {
        ArrayList<Shape> shapes = new ArrayList<>();
        File fXmlFile = new File(filepath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        Element rootelement = doc.getDocumentElement();

        NodeList nList = rootelement.getChildNodes();
        int x1, y1, radius, r, g, b,width,length,rh,rv,side;
        Stroke st;
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                if (eElement.getNodeName().equalsIgnoreCase("Circle")) {
                    x1 = Integer.parseInt(eElement.getElementsByTagName("X").item(0).getTextContent());
                    y1 = Integer.parseInt(eElement.getElementsByTagName("Y").item(0).getTextContent());
                    radius = Integer.parseInt(eElement.getElementsByTagName("Radius").item(0).getTextContent());
                    r = Integer.parseInt(eElement.getElementsByTagName("Red").item(0).getTextContent());
                    g = Integer.parseInt(eElement.getElementsByTagName("Green").item(0).getTextContent());
                    b = Integer.parseInt(eElement.getElementsByTagName("Blue").item(0).getTextContent());
                    st = new BasicStroke((float)Integer.parseInt(eElement.getElementsByTagName("Stroke").item(0).getTextContent()));
                 Circle c = new Circle(x1, y1, new Color(r,g,b),radius,st);
                    shapes.add(c);
                } else if (eElement.getNodeName().equalsIgnoreCase("Rectangle")) {
                    x1 = Integer.parseInt(eElement.getElementsByTagName("X").item(0).getTextContent());
                    y1 = Integer.parseInt(eElement.getElementsByTagName("Y").item(0).getTextContent());
                    width = Integer.parseInt(eElement.getElementsByTagName("Width").item(0).getTextContent());
                    length= Integer.parseInt(eElement.getElementsByTagName("Length").item(0).getTextContent());
                    r = Integer.parseInt(eElement.getElementsByTagName("Red").item(0).getTextContent());
                    g = Integer.parseInt(eElement.getElementsByTagName("Green").item(0).getTextContent());
                    b = Integer.parseInt(eElement.getElementsByTagName("Blue").item(0).getTextContent());
                    st = new BasicStroke((float)Integer.parseInt(eElement.getElementsByTagName("Stroke").item(0).getTextContent()));
                    Rectangle re = new Rectangle(x1, y1,new Color(r,g,b),length,width,st);
                    shapes.add(re);
                } else if (eElement.getNodeName().equalsIgnoreCase("Oval")) {
                    x1 = Integer.parseInt(eElement.getElementsByTagName("X").item(0).getTextContent());
                    y1= Integer.parseInt(eElement.getElementsByTagName("Y").item(0).getTextContent());
                    rh = Integer.parseInt(eElement.getElementsByTagName("RH").item(0).getTextContent());
                    rv = Integer.parseInt(eElement.getElementsByTagName("RV").item(0).getTextContent());
                    r = Integer.parseInt(eElement.getElementsByTagName("Red").item(0).getTextContent());
                    g = Integer.parseInt(eElement.getElementsByTagName("Green").item(0).getTextContent());
                    b = Integer.parseInt(eElement.getElementsByTagName("Blue").item(0).getTextContent());
                    st = new BasicStroke((float)Integer.parseInt(eElement.getElementsByTagName("Stroke").item(0).getTextContent()));
                   Oval e = new Oval(x1, y1, new Color(r, g, b), rh,rv,st);
                    shapes.add(e);
                } else if (eElement.getNodeName().equalsIgnoreCase("Square")) {
                    x1 = Integer.parseInt(eElement.getElementsByTagName("X").item(0).getTextContent());
                    y1= Integer.parseInt(eElement.getElementsByTagName("Y").item(0).getTextContent());
                    side = Integer.parseInt(eElement.getElementsByTagName("Side").item(0).getTextContent());
                    r = Integer.parseInt(eElement.getElementsByTagName("red").item(0).getTextContent());
                    g = Integer.parseInt(eElement.getElementsByTagName("green").item(0).getTextContent());
                    b = Integer.parseInt(eElement.getElementsByTagName("blue").item(0).getTextContent());
                    st = new BasicStroke((float)Integer.parseInt(eElement.getElementsByTagName("Stroke").item(0).getTextContent()));
                    Square s = new Square(x1, y1, new Color(r, g, b),side,st);
                    shapes.add(s);
                } 
            }

        }
        return shapes;
    }

}
