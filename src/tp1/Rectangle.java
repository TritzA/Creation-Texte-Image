package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        super(constructionListe(width, height));
    }

    private static Collection<Point2d> constructionListe(Double width, Double height) {
        Collection<Point2d> nouveau = new ArrayList<Point2d>();
        width /= 2;
        height /= 2;
        for (int i = (int) -width; i < width; i++) {
            for (int j = (int) -height; j < height; j++) {
                nouveau.add(new Point2d((double) i, (double) j));
            }
        }
        return nouveau;
    }

    // TODO creer un rectangle avec les dimensions contenu dans un Point.
    public Rectangle(Point2d dimensions) {
        super(constructionListe(dimensions.X(), dimensions.Y()));
    }

    // TODO initialiser le parent.
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Rectangle translate(Point2d point) {
        for (Point2d point2d : this.getCoords()) {
            point2d.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Rectangle rotate(Double angle) {
        for (Point2d point2d : this.getCoords()) {
            point2d.rotate(angle);
        }
        return this;
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Rectangle clone() {
        Rectangle rectangle = new Rectangle(this.getMaxX(), this.getMaxY());
        for (Point2d point2d :
                this.getCoords()) {
            rectangle.getCoords().add(point2d);
        }
        return rectangle;
    }
}