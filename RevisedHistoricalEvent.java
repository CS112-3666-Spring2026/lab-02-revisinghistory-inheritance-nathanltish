/**
 * 
 * RevisedHistoricalEvent.java - Adds onto HistoricalEvent to
 * add extra data to correct "historical" information.
 */

public class RevisedHistoricalEvent extends HistoricalEvent {

    //** CONSTANTS **//
    public static final String DEFAULT_REVISED_DESCRIPTION = "Historical event description default. ";
    public static final String DEFAULT_CITATION = "Academic resoruce/citation. ";


    //** INSTANCE VARIABLES **//
    private String revisedDescription;
    private String citation;


    //** CONSTRUCTORS **//
    /**
     * Full constructor sets object to parameter values if valid, otherwise outputs error message and exits program
     * 
     * @param description original "historical" description
     * @param eventDay Date of historical event
     * @param revisedDescription revised historical event description
     * @param citation formal citation or link resource
     */
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
        }


    /**
     * Default constructor sets RevisedHistoricalEvent object to default values
     */
    public RevisedHistoricalEvent() {
        this(HistoricalEvent.DEFAULT_DESCRIPTION, HistoricalEvent.DEFAULT_EVENT_DAY, DEFAULT_REVISED_DESCRIPTION,
                DEFAULT_CITATION);
    }


    /**
     * Copy constructor creates a deep copy of original RevisedHistoricalEvent object
     * if object null outputs error message and exits program.
     * 
     * @param origianal valid RevisedHistoricalEvent object to deep copy
     */
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        if (original != null) {
            this.setAll(original.getDescription(), original.getEventDay(), original.revisedDescription, original.citation);
        } else {
            System.out.println("ERROR: null data given to copy constructor");
            System.exit(0);
        }
    }


    //** SETTERS / MUTATORS **//
    /**
     * Sets revised description of the instance vairble (no error checking)
     * 
     * @param revisedDescription revised historical event description
     */
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }


    /**
     * Sets citation instance variable (no error checking)
     * 
     * @param citation formal citation or link resource
     */
    public void setCitation(String citation) {
        this.citation = citation;
    }


    /**
     * Sets all instance variables if parameters are valid
     * 
     * @param description historical event description
     * @param eventDay eventDay Date of historical event
     * @param revisedDescription revised historical event description
     * @param citation formal citation or link resource
     * 
     * @return returs true if description and eventDay are valid, false otherwise
     */

    public boolean setAll(String description, Date eventDay, String revisedDescription, String citation) {
        if (super.setAll(revisedDescription, eventDay)) {
            this.setRevisedDescription(revisedDescription);
            this.setCitation(citation);
            return true;
        } else {
            return false;
        }
    }


    //** GETTERS / ACCESSORS **//
    /**
     * Access value of revisedDescripton instance variable
     * 
     * @return revised descrition of historal event
     */
    public String getRevisedDescription() {
        return this.revisedDescription;
    }


    /**
     * Access value of citation instance variable
     * 
     * @return citation value (resource, or link) of historal event
     */
    public String getCitation() {
        return this.citation;
    }  
    
    
    //** OTHER REQUIRED METHODS  **/
   @Override // no documentation needed when using the override flag
    public String toString() {
        return "The following \"history\" was told for many years:\n\n" +
                super.toString()
                + "\n\nBy correcting history, not just rewrting it, we are revisting it to embark on the process of righting a wrong. \nHere is the revised history:\n\n"
                + this.revisedDescription + "\n\nSource: " + this.citation;
    }
    
   @Override // no documentation needed when using the override flag
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
            return super.equals(other) && this.revisedDescription.equals(otherEvent.revisedDescription)
                    && this.citation.equals(otherEvent.citation);
        }
    }


    /**
   * Output to console structured to educate people about historical events, showing that past
   * versions many have been educated with vs. th revised history, correcting mis
   * and providing a source for furhter learning.
   */
    public void teach() {
        System.out.println(this.toString());

       // OR 

       // System.out.println("The following \"history \" was told for many years:\n\n" + super.toString());
       // System.out.println(
       //         "\n\nBy correcting history, not just rewrting it, we are revisting it to embark on the process of righting a wrong. \nHere is the revised history:\n"
       //         + this.revisedDescription);
       // System.out.println("\nSource: " + this.citation);
    }
}