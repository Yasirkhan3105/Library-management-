package models;

import java.sql.Date;

public class Transaction {
    private int id;
    private int userId;
    private int bookId;
    private Date dateBorrowed;
    private Date dateReturned;

    public Transaction(int id, int userId, int bookId, Date dateBorrowed, Date dateReturned) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.dateBorrowed = dateBorrowed;
        this.dateReturned = dateReturned;
    }

    // Getters and Setters
    public int getId() { return id; }
    public int getUserId() { return userId; }
    public int getBookId() { return bookId; }
    public Date getDateBorrowed() { return dateBorrowed; }
    public Date getDateReturned() { return dateReturned; }

    public void setId(int id) { this.id = id; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public void setDateBorrowed(Date dateBorrowed) { this.dateBorrowed = dateBorrowed; }
    public void setDateReturned(Date dateReturned) { this.dateReturned = dateReturned; }

    @Override
    public String toString() {
        return id + " | UserID: " + userId + " | BookID: " + bookId + " | Borrowed: " + dateBorrowed + " | Returned: " + dateReturned;
    }
}
