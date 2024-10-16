/**
 * Class representing an educational institution.
 */
public class Institution {
    /** Name of the institution */
    String name;
    /** City where the institution is located */
    String city;
    /** State where the institution is located */
    String state;
    /** Act under which the institution is established */
    String act;
    /** Ministry responsible for the institution */
    String ministry;

    /**
     * Constructor to initialize the Institution object.
     *
     * @param name     Name of the institution
     * @param city     City where the institution is located
     * @param state    State where the institution is located
     * @param act      Act under which the institution is established
     * @param ministry  Ministry responsible for the institution
     */
    public Institution(String name, String city, String state, String act, String ministry) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.act = act;
        this.ministry = ministry;
    }
}
