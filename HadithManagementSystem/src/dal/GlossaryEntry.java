package dal;

public class GlossaryEntry {

    private int id;
    private Integer bookId;      // null when the entry belongs to a chapter
    private Integer chapterId;   // null when the entry belongs to a book
    private String arabicTerm;
    private String urduMeaning;
    private String urduExplanation;

    public GlossaryEntry(int id, Integer bookId, Integer chapterId, String arabicTerm,
            String urduMeaning, String urduExplanation) {
        this.id = id;
        this.bookId = bookId;
        this.chapterId = chapterId;
        this.arabicTerm = arabicTerm;
        this.urduMeaning = urduMeaning;
        this.urduExplanation = urduExplanation;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public Integer getChapterId() { return chapterId; }
    public void setChapterId(Integer chapterId) { this.chapterId = chapterId; }

    public String getArabicTerm() { return arabicTerm; }
    public void setArabicTerm(String arabicTerm) { this.arabicTerm = arabicTerm; }

    public String getUrduMeaning() { return urduMeaning; }
    public void setUrduMeaning(String urduMeaning) { this.urduMeaning = urduMeaning; }

    public String getUrduExplanation() { return urduExplanation; }
    public void setUrduExplanation(String urduExplanation) {
        this.urduExplanation = urduExplanation;
    }
}