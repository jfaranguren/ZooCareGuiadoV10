package model;

/**
 * Defines the identifier operations shared by identifiable model objects.
 */
public interface Identifiable {

    /**
     * Generates an identifier for this object.
     *
     * @return the generated identifier
     */
    public abstract String generateId();

    /**
     * Returns this object's identifier.
     *
     * @return this object's identifier
     */
    public abstract String getId();

}
