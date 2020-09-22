package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    // TODO
    public static BaseShape create_e() {
        Ellipse courbe = new Ellipse(maxWidth, maxHeight);
        Ellipse centreVide = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);

        Rectangle espaceDroit = new Rectangle(halfMaxWidth, stripeThickness);
        espaceDroit.translate(new Point2d(halfMaxWidth / 2, stripeThickness));
        Rectangle barre = new Rectangle(maxWidth, stripeThickness);

        return courbe.remove(centreVide).remove(espaceDroit).add(barre);
    }

    // TODO
    public static BaseShape create_a() {
        Ellipse courbe = new Ellipse(maxWidth, maxHeight);
        Ellipse centreVide = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);
        Rectangle barre = new Rectangle(maxWidth / 6, maxHeight);
        barre.translate(new Point2d(halfMaxWidth, 0.));

        return courbe.add(barre).remove(centreVide);
    }

    public static BaseShape create_C() {
        Ellipse courbe = new Ellipse(maxWidth, maxHeight);
        Ellipse centreVide = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);
        Rectangle espaceDroit = new Rectangle(halfMaxWidth, maxHeight / 1.5);
        espaceDroit.translate(new Point2d(halfMaxWidth / 2, 0.));

        return courbe.remove(centreVide).remove(espaceDroit);
    }

    // TODO
    public static BaseShape create_l() {
        Rectangle barre = new Rectangle(maxWidth / 6, maxHeight);

        return barre;
    }

    // TODO
    public static BaseShape create_i() {
        Rectangle barre = new Rectangle(maxWidth / 6, maxHeight);
        Circle point = new Circle(stripeThickness);
        point.translate(new Point2d(0., -halfMaxHeight * 0.9));
        Rectangle espaceHaut = new Rectangle(maxWidth / 6, halfMaxHeight * 0.5);
        espaceHaut.translate(new Point2d(0.0, -halfMaxHeight * 0.8));

        return barre.add(point).remove(espaceHaut);
    }

    // TODO
    public static BaseShape create_A() {
        Rectangle droite = new Rectangle(maxWidth / 6, maxHeight);
        Rectangle gauche = new Rectangle(maxWidth / 6, maxHeight);
        Rectangle centre = new Rectangle(halfMaxWidth, halfStripeThickness);

        droite.rotate(-Math.PI / 16);
        gauche.rotate(Math.PI / 16);

        droite.translate(new Point2d(halfMaxWidth * 0.5, 0.));
        gauche.translate(new Point2d(-halfMaxWidth * 0.5, 0.));

        centre.add(gauche);
        centre.add(droite);

        return centre;
    }

    // TODO
    public static BaseShape create_V() {
        Rectangle droite = new Rectangle(maxWidth / 6, maxHeight);
        Rectangle gauche = new Rectangle(maxWidth / 6, maxHeight);

        droite.rotate(Math.PI / 16);
        gauche.rotate(-Math.PI / 16);

        droite.translate(new Point2d(maxWidth, 0.));
        gauche.translate(new Point2d(halfMaxWidth, 0.));

        return droite.add(gauche);
    }

    // TODO
    public static BaseShape create_n() {
        Circle partieHaut = new Circle(halfMaxWidth * 2);
        Circle centreVide = new Circle(halfMaxWidth * 2 - stripeThickness);
        Rectangle espaceBas = new Rectangle(maxWidth * 2,
                maxHeight / 2 - stripeThickness);

        Rectangle barreGauche = new Rectangle(maxWidth / 6, maxHeight);

        Rectangle barreDroite = new Rectangle(maxWidth / 6, maxHeight);
        Rectangle espaceHaut = new Rectangle(maxWidth / 6, halfMaxHeight);

        partieHaut.translate(new Point2d(0.0, -halfMaxHeight * 0.5));
        centreVide.translate(new Point2d(0.0, -halfMaxHeight * 0.5));
        espaceBas.translate(new Point2d(0.0, -halfStripeThickness));
        barreGauche.translate(new Point2d(-halfMaxWidth + halfStripeThickness / 2, 0.0));
        barreDroite.translate(new Point2d(halfMaxWidth - halfStripeThickness / 2, 0.0));
        espaceHaut.translate(new Point2d(halfMaxWidth - halfStripeThickness / 2, -halfMaxHeight));

        partieHaut.remove(centreVide);
        partieHaut.remove(espaceBas);
        partieHaut.add(barreGauche);
        barreDroite.remove(espaceHaut);
        partieHaut.add(barreDroite);

        return partieHaut;
    }

    // TODO
    public static BaseShape create_r() {
        Circle partieHaut = new Circle(halfMaxWidth * 2);
        Circle centreVide = new Circle(halfMaxWidth * 2 - stripeThickness);
        Rectangle espaceBas = new Rectangle(maxWidth * 2,
                maxHeight / 2 - stripeThickness);

        Rectangle barre = new Rectangle(maxWidth / 6, maxHeight);

        partieHaut.translate(new Point2d(0.0, -halfMaxHeight * 0.5));
        centreVide.translate(new Point2d(0.0, -halfMaxHeight * 0.5));
        espaceBas.translate(new Point2d(0.0, -halfStripeThickness));
        barre.translate(new Point2d(-halfMaxWidth + halfStripeThickness / 2, 0.0));

        partieHaut.remove(centreVide);
        partieHaut.remove(espaceBas);
        partieHaut.add(barre);

        return partieHaut;
    }

    // TODO
    public static BaseShape create_B() {
        Rectangle rectangle = new Rectangle(maxWidth / 6, maxHeight);

        Ellipse ellipseHaut = new Ellipse(maxHeight / 2, maxHeight / 2);
        Ellipse centreVideHaut = new Ellipse(maxHeight / 2 - stripeThickness,
                maxHeight / 2 - stripeThickness);
        ellipseHaut.translate(new Point2d(0., -maxHeight / 4));
        centreVideHaut.translate(new Point2d(0., -maxHeight / 4));

        Ellipse ellipseBas = new Ellipse(maxHeight / 2, maxHeight / 2);
        Ellipse centreVideBas = new Ellipse(maxHeight / 2 - stripeThickness,
                maxHeight / 2 - stripeThickness);
        ellipseBas.translate(new Point2d(0., maxHeight / 4));
        centreVideBas.translate(new Point2d(0., maxHeight / 4));

        Rectangle espaceGauche = new Rectangle(maxWidth, maxHeight);
        espaceGauche.translate(new Point2d(-(maxWidth / 2), 0.));

        ellipseHaut = (Ellipse) ellipseHaut.remove(centreVideHaut).remove(espaceGauche);
        ellipseBas = (Ellipse) ellipseBas.remove(centreVideBas).remove(espaceGauche);

        return rectangle.add(ellipseBas).add(ellipseHaut);
    }
}
