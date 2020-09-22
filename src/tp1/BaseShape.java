package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;

    // TODO Initialiser la liste de points.
    public BaseShape() {
        this.coords = new ArrayList<Point2d>();
    }

    // TODO prendre une liste de points et creer une nouvelle forme.
    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<Point2d>(coords);
    }

    // TODO ajouter ou retirer des coordonnees a la liste de points.
    public BaseShape add(Point2d coord) {
        this.coords.add(coord);
        return this;
    }

    public BaseShape add(BaseShape shape) {
        for (Point2d point2d : shape.coords) {
            this.coords.add(point2d);
        }
        return this;
    }

    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return this;
    }

    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }

    public BaseShape remove(BaseShape shape) {
        for (Point2d point2d : shape.coords) {
            this.coords.remove(point2d);
        }
        return this;
    }

    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    // TODO retourner les coordonnees de la liste.
    public Collection<Point2d> getCoords() {
        ArrayList<Point2d> nouveau = new ArrayList<Point2d>(this.coords);
        return nouveau;
    }

    // TODO retourner une nouvelle liste ou tous les points sont des copy
    public Collection<Point2d> getCoordsDeepCopy() {
        ArrayList<Point2d> nouveau = new ArrayList<Point2d>();
        for (Point2d point2d : this.coords) {
            nouveau.add(new Point2d(point2d.X(), point2d.Y()));
        }
        return nouveau;
    }

    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        for (Point2d point2d : this.coords) {
            point2d.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        for (Point2d point2d : this.coords) {
            point2d.rotate(angle);
        }
        return this;
    }

    // TODO donner la plus grande valeur en X
    public Double getMaxX() {
        double x = Double.MIN_VALUE;
        for (Point2d point2d : this.coords) {
            if (point2d.X() > x) {
                x = point2d.X();
            }
        }
        return x;
    }

    // TODO donner la plus grande valeur en Y
    public Double getMaxY() {
        double y = Double.MIN_VALUE;
        for (Point2d point2d : this.coords) {
            if (point2d.Y() > y) {
                y = point2d.Y();
            }
        }
        return y;
    }

    // TODO donner les plus grandes valeurs en X et Y
    public Point2d getMaxCoord() {
        return new Point2d(getMaxX(), getMaxY());
    }

    // TODO donner la plus petite valeur en X
    public Double getMinX() {
        double x = Double.MAX_VALUE;
        for (Point2d point2d : this.coords) {
            if (point2d.X() < x) {
                x = point2d.X();
            }
        }
        return x;
    }

    // TODO donner la plus petite valeur en Y
    public Double getMinY() {
        double y = Double.MAX_VALUE;
        for (Point2d point2d : this.coords) {
            if (point2d.Y() < y) {
                y = point2d.Y();
            }
        }
        return y;
    }

    // TODO donner les plus petites valeurs en X et Y
    public Point2d getMinCoord() {
        return new Point2d(getMinX(), getMinY());
    }// TODO retourner une nouvelle forme.

    public BaseShape clone() {
        BaseShape baseShape = new BaseShape();
        for (Point2d point2d :
                this.coords) {
            baseShape.coords.add(point2d);
        }
        return baseShape;
    }
}
