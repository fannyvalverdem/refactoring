/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.good;

/**
 *
 * @author Fanny
 */
public class UniversalBoardCoordinate {
    
    public UniversalBoardCoordinate(String locationPhrase) throws InvalidCoordinateException {
        Integer[] orderedPair = parseString(locationPhrase);

        Integer row = orderedPair[0];
        Integer column = orderedPair[1];
    }
    
    private Integer[] parseString(String locationPhrase) throws InvalidCoordinateException {
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");
        checkValidity(coordinates);
        return parseCoordinates(coordinates);
    }
    private void checkValidity(String[] coordinates) throws InvalidCoordinateException {
        if (coordinates.length != 2) {
            throw new InvalidCoordinateException("That's not a valid board location.");
        }
    }
    private Integer[] parseCoordinates(String[] coordinates) {
        return new Integer[] { Integer.parseInt(coordinates[0].trim()),
                               Integer.parseInt(coordinates[1].trim()) };
    }
    
    
}
