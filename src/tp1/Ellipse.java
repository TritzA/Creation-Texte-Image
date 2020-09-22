package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    // TODO creer une ellipse avec une largeur et une longueur.
    public Ellipse(Double widthRadius, Double heightRadius) {
        super(constructionListe(widthRadius, heightRadius));
    }

    private static Collection<Point2d> constructionListe(Double width, Double height) {
        Collection<Point2d> nouveau = new ArrayList<Point2d>();
        width /= 2;
        height /= 2;
        for (int i = (int) -width; i < width; i++) {
            for (int j = (int) -height; j < height; j++) {
                if ((i * i) / (width * width) + (j * j) / (height * height) <= 1)
                    nouveau.add(new Point2d((double) i, (double) j));
            }
        }
        return nouveau;
    }

    // TODO creer une ellipse avec les dimensions contenu dans un Point.
    public Ellipse(Point2d dimensions) {
        super(constructionListe(dimensions.X(), dimensions.Y()));
    }

    // TODO initialiser le parent.
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Ellipse translate(Point2d point) {
        for (Point2d point2d : this.getCoords()) {
            point2d.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Ellipse rotate(Double angle) {
        for (Point2d point2d : this.getCoords()) {
            point2d.rotate(angle);
        }
        return this;
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Ellipse clone() {
        Ellipse ellipse = new Ellipse(this.getMaxX(), this.getMaxY());
        for (Point2d point2d :
                this.getCoords()) {
            ellipse.getCoords().add(point2d);
        }
        return ellipse;
    }
}