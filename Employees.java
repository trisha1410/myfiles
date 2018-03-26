// ORM class for table 'Employees'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Feb 26 19:03:31 UTC 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Employees extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("EmployeeID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EmployeeID = (Integer)value;
      }
    });
    setters.put("LastName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LastName = (String)value;
      }
    });
    setters.put("FirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FirstName = (String)value;
      }
    });
    setters.put("Title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Title = (String)value;
      }
    });
    setters.put("TitleOfCourtesy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TitleOfCourtesy = (String)value;
      }
    });
    setters.put("BirthDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BirthDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("HireDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HireDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("Address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Address = (String)value;
      }
    });
    setters.put("City", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        City = (String)value;
      }
    });
    setters.put("Region", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Region = (String)value;
      }
    });
    setters.put("PostalCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PostalCode = (String)value;
      }
    });
    setters.put("Country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Country = (String)value;
      }
    });
    setters.put("HomePhone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HomePhone = (String)value;
      }
    });
    setters.put("Extension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Extension = (String)value;
      }
    });
    setters.put("Photo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Photo = (com.cloudera.sqoop.lib.BlobRef)value;
      }
    });
    setters.put("Notes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Notes = (String)value;
      }
    });
    setters.put("ReportsTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ReportsTo = (Integer)value;
      }
    });
    setters.put("PhotoPath", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PhotoPath = (String)value;
      }
    });
    setters.put("Salary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Salary = (Float)value;
      }
    });
  }
  public Employees() {
    init0();
  }
  private Integer EmployeeID;
  public Integer get_EmployeeID() {
    return EmployeeID;
  }
  public void set_EmployeeID(Integer EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  public Employees with_EmployeeID(Integer EmployeeID) {
    this.EmployeeID = EmployeeID;
    return this;
  }
  private String LastName;
  public String get_LastName() {
    return LastName;
  }
  public void set_LastName(String LastName) {
    this.LastName = LastName;
  }
  public Employees with_LastName(String LastName) {
    this.LastName = LastName;
    return this;
  }
  private String FirstName;
  public String get_FirstName() {
    return FirstName;
  }
  public void set_FirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  public Employees with_FirstName(String FirstName) {
    this.FirstName = FirstName;
    return this;
  }
  private String Title;
  public String get_Title() {
    return Title;
  }
  public void set_Title(String Title) {
    this.Title = Title;
  }
  public Employees with_Title(String Title) {
    this.Title = Title;
    return this;
  }
  private String TitleOfCourtesy;
  public String get_TitleOfCourtesy() {
    return TitleOfCourtesy;
  }
  public void set_TitleOfCourtesy(String TitleOfCourtesy) {
    this.TitleOfCourtesy = TitleOfCourtesy;
  }
  public Employees with_TitleOfCourtesy(String TitleOfCourtesy) {
    this.TitleOfCourtesy = TitleOfCourtesy;
    return this;
  }
  private java.sql.Timestamp BirthDate;
  public java.sql.Timestamp get_BirthDate() {
    return BirthDate;
  }
  public void set_BirthDate(java.sql.Timestamp BirthDate) {
    this.BirthDate = BirthDate;
  }
  public Employees with_BirthDate(java.sql.Timestamp BirthDate) {
    this.BirthDate = BirthDate;
    return this;
  }
  private java.sql.Timestamp HireDate;
  public java.sql.Timestamp get_HireDate() {
    return HireDate;
  }
  public void set_HireDate(java.sql.Timestamp HireDate) {
    this.HireDate = HireDate;
  }
  public Employees with_HireDate(java.sql.Timestamp HireDate) {
    this.HireDate = HireDate;
    return this;
  }
  private String Address;
  public String get_Address() {
    return Address;
  }
  public void set_Address(String Address) {
    this.Address = Address;
  }
  public Employees with_Address(String Address) {
    this.Address = Address;
    return this;
  }
  private String City;
  public String get_City() {
    return City;
  }
  public void set_City(String City) {
    this.City = City;
  }
  public Employees with_City(String City) {
    this.City = City;
    return this;
  }
  private String Region;
  public String get_Region() {
    return Region;
  }
  public void set_Region(String Region) {
    this.Region = Region;
  }
  public Employees with_Region(String Region) {
    this.Region = Region;
    return this;
  }
  private String PostalCode;
  public String get_PostalCode() {
    return PostalCode;
  }
  public void set_PostalCode(String PostalCode) {
    this.PostalCode = PostalCode;
  }
  public Employees with_PostalCode(String PostalCode) {
    this.PostalCode = PostalCode;
    return this;
  }
  private String Country;
  public String get_Country() {
    return Country;
  }
  public void set_Country(String Country) {
    this.Country = Country;
  }
  public Employees with_Country(String Country) {
    this.Country = Country;
    return this;
  }
  private String HomePhone;
  public String get_HomePhone() {
    return HomePhone;
  }
  public void set_HomePhone(String HomePhone) {
    this.HomePhone = HomePhone;
  }
  public Employees with_HomePhone(String HomePhone) {
    this.HomePhone = HomePhone;
    return this;
  }
  private String Extension;
  public String get_Extension() {
    return Extension;
  }
  public void set_Extension(String Extension) {
    this.Extension = Extension;
  }
  public Employees with_Extension(String Extension) {
    this.Extension = Extension;
    return this;
  }
  private com.cloudera.sqoop.lib.BlobRef Photo;
  public com.cloudera.sqoop.lib.BlobRef get_Photo() {
    return Photo;
  }
  public void set_Photo(com.cloudera.sqoop.lib.BlobRef Photo) {
    this.Photo = Photo;
  }
  public Employees with_Photo(com.cloudera.sqoop.lib.BlobRef Photo) {
    this.Photo = Photo;
    return this;
  }
  private String Notes;
  public String get_Notes() {
    return Notes;
  }
  public void set_Notes(String Notes) {
    this.Notes = Notes;
  }
  public Employees with_Notes(String Notes) {
    this.Notes = Notes;
    return this;
  }
  private Integer ReportsTo;
  public Integer get_ReportsTo() {
    return ReportsTo;
  }
  public void set_ReportsTo(Integer ReportsTo) {
    this.ReportsTo = ReportsTo;
  }
  public Employees with_ReportsTo(Integer ReportsTo) {
    this.ReportsTo = ReportsTo;
    return this;
  }
  private String PhotoPath;
  public String get_PhotoPath() {
    return PhotoPath;
  }
  public void set_PhotoPath(String PhotoPath) {
    this.PhotoPath = PhotoPath;
  }
  public Employees with_PhotoPath(String PhotoPath) {
    this.PhotoPath = PhotoPath;
    return this;
  }
  private Float Salary;
  public Float get_Salary() {
    return Salary;
  }
  public void set_Salary(Float Salary) {
    this.Salary = Salary;
  }
  public Employees with_Salary(Float Salary) {
    this.Salary = Salary;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employees)) {
      return false;
    }
    Employees that = (Employees) o;
    boolean equal = true;
    equal = equal && (this.EmployeeID == null ? that.EmployeeID == null : this.EmployeeID.equals(that.EmployeeID));
    equal = equal && (this.LastName == null ? that.LastName == null : this.LastName.equals(that.LastName));
    equal = equal && (this.FirstName == null ? that.FirstName == null : this.FirstName.equals(that.FirstName));
    equal = equal && (this.Title == null ? that.Title == null : this.Title.equals(that.Title));
    equal = equal && (this.TitleOfCourtesy == null ? that.TitleOfCourtesy == null : this.TitleOfCourtesy.equals(that.TitleOfCourtesy));
    equal = equal && (this.BirthDate == null ? that.BirthDate == null : this.BirthDate.equals(that.BirthDate));
    equal = equal && (this.HireDate == null ? that.HireDate == null : this.HireDate.equals(that.HireDate));
    equal = equal && (this.Address == null ? that.Address == null : this.Address.equals(that.Address));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.HomePhone == null ? that.HomePhone == null : this.HomePhone.equals(that.HomePhone));
    equal = equal && (this.Extension == null ? that.Extension == null : this.Extension.equals(that.Extension));
    equal = equal && (this.Photo == null ? that.Photo == null : this.Photo.equals(that.Photo));
    equal = equal && (this.Notes == null ? that.Notes == null : this.Notes.equals(that.Notes));
    equal = equal && (this.ReportsTo == null ? that.ReportsTo == null : this.ReportsTo.equals(that.ReportsTo));
    equal = equal && (this.PhotoPath == null ? that.PhotoPath == null : this.PhotoPath.equals(that.PhotoPath));
    equal = equal && (this.Salary == null ? that.Salary == null : this.Salary.equals(that.Salary));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employees)) {
      return false;
    }
    Employees that = (Employees) o;
    boolean equal = true;
    equal = equal && (this.EmployeeID == null ? that.EmployeeID == null : this.EmployeeID.equals(that.EmployeeID));
    equal = equal && (this.LastName == null ? that.LastName == null : this.LastName.equals(that.LastName));
    equal = equal && (this.FirstName == null ? that.FirstName == null : this.FirstName.equals(that.FirstName));
    equal = equal && (this.Title == null ? that.Title == null : this.Title.equals(that.Title));
    equal = equal && (this.TitleOfCourtesy == null ? that.TitleOfCourtesy == null : this.TitleOfCourtesy.equals(that.TitleOfCourtesy));
    equal = equal && (this.BirthDate == null ? that.BirthDate == null : this.BirthDate.equals(that.BirthDate));
    equal = equal && (this.HireDate == null ? that.HireDate == null : this.HireDate.equals(that.HireDate));
    equal = equal && (this.Address == null ? that.Address == null : this.Address.equals(that.Address));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.HomePhone == null ? that.HomePhone == null : this.HomePhone.equals(that.HomePhone));
    equal = equal && (this.Extension == null ? that.Extension == null : this.Extension.equals(that.Extension));
    equal = equal && (this.Photo == null ? that.Photo == null : this.Photo.equals(that.Photo));
    equal = equal && (this.Notes == null ? that.Notes == null : this.Notes.equals(that.Notes));
    equal = equal && (this.ReportsTo == null ? that.ReportsTo == null : this.ReportsTo.equals(that.ReportsTo));
    equal = equal && (this.PhotoPath == null ? that.PhotoPath == null : this.PhotoPath.equals(that.PhotoPath));
    equal = equal && (this.Salary == null ? that.Salary == null : this.Salary.equals(that.Salary));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.EmployeeID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.LastName = JdbcWritableBridge.readString(2, __dbResults);
    this.FirstName = JdbcWritableBridge.readString(3, __dbResults);
    this.Title = JdbcWritableBridge.readString(4, __dbResults);
    this.TitleOfCourtesy = JdbcWritableBridge.readString(5, __dbResults);
    this.BirthDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.HireDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.Address = JdbcWritableBridge.readString(8, __dbResults);
    this.City = JdbcWritableBridge.readString(9, __dbResults);
    this.Region = JdbcWritableBridge.readString(10, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(11, __dbResults);
    this.Country = JdbcWritableBridge.readString(12, __dbResults);
    this.HomePhone = JdbcWritableBridge.readString(13, __dbResults);
    this.Extension = JdbcWritableBridge.readString(14, __dbResults);
    this.Photo = JdbcWritableBridge.readBlobRef(15, __dbResults);
    this.Notes = JdbcWritableBridge.readString(16, __dbResults);
    this.ReportsTo = JdbcWritableBridge.readInteger(17, __dbResults);
    this.PhotoPath = JdbcWritableBridge.readString(18, __dbResults);
    this.Salary = JdbcWritableBridge.readFloat(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.EmployeeID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.LastName = JdbcWritableBridge.readString(2, __dbResults);
    this.FirstName = JdbcWritableBridge.readString(3, __dbResults);
    this.Title = JdbcWritableBridge.readString(4, __dbResults);
    this.TitleOfCourtesy = JdbcWritableBridge.readString(5, __dbResults);
    this.BirthDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.HireDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.Address = JdbcWritableBridge.readString(8, __dbResults);
    this.City = JdbcWritableBridge.readString(9, __dbResults);
    this.Region = JdbcWritableBridge.readString(10, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(11, __dbResults);
    this.Country = JdbcWritableBridge.readString(12, __dbResults);
    this.HomePhone = JdbcWritableBridge.readString(13, __dbResults);
    this.Extension = JdbcWritableBridge.readString(14, __dbResults);
    this.Photo = JdbcWritableBridge.readBlobRef(15, __dbResults);
    this.Notes = JdbcWritableBridge.readString(16, __dbResults);
    this.ReportsTo = JdbcWritableBridge.readInteger(17, __dbResults);
    this.PhotoPath = JdbcWritableBridge.readString(18, __dbResults);
    this.Salary = JdbcWritableBridge.readFloat(19, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.Photo = __loader.readBlobRef(15, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.Photo = __loader.readBlobRef(15, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(EmployeeID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(LastName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FirstName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Title, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TitleOfCourtesy, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(BirthDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HireDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Address, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HomePhone, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Extension, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(Photo, 15 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(Notes, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(ReportsTo, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(PhotoPath, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(Salary, 19 + __off, 7, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(EmployeeID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(LastName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FirstName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Title, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TitleOfCourtesy, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(BirthDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HireDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Address, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HomePhone, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Extension, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(Photo, 15 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(Notes, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(ReportsTo, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(PhotoPath, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(Salary, 19 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.EmployeeID = null;
    } else {
    this.EmployeeID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LastName = null;
    } else {
    this.LastName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FirstName = null;
    } else {
    this.FirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Title = null;
    } else {
    this.Title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TitleOfCourtesy = null;
    } else {
    this.TitleOfCourtesy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BirthDate = null;
    } else {
    this.BirthDate = new Timestamp(__dataIn.readLong());
    this.BirthDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.HireDate = null;
    } else {
    this.HireDate = new Timestamp(__dataIn.readLong());
    this.HireDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Address = null;
    } else {
    this.Address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.City = null;
    } else {
    this.City = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Region = null;
    } else {
    this.Region = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PostalCode = null;
    } else {
    this.PostalCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Country = null;
    } else {
    this.Country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HomePhone = null;
    } else {
    this.HomePhone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Extension = null;
    } else {
    this.Extension = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Photo = null;
    } else {
    this.Photo = com.cloudera.sqoop.lib.LobSerializer.readBlobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Notes = null;
    } else {
    this.Notes = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ReportsTo = null;
    } else {
    this.ReportsTo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PhotoPath = null;
    } else {
    this.PhotoPath = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Salary = null;
    } else {
    this.Salary = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.EmployeeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.EmployeeID);
    }
    if (null == this.LastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LastName);
    }
    if (null == this.FirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FirstName);
    }
    if (null == this.Title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Title);
    }
    if (null == this.TitleOfCourtesy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TitleOfCourtesy);
    }
    if (null == this.BirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.BirthDate.getTime());
    __dataOut.writeInt(this.BirthDate.getNanos());
    }
    if (null == this.HireDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HireDate.getTime());
    __dataOut.writeInt(this.HireDate.getNanos());
    }
    if (null == this.Address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Address);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.PostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PostalCode);
    }
    if (null == this.Country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country);
    }
    if (null == this.HomePhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HomePhone);
    }
    if (null == this.Extension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Extension);
    }
    if (null == this.Photo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.Photo, __dataOut);
    }
    if (null == this.Notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Notes);
    }
    if (null == this.ReportsTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReportsTo);
    }
    if (null == this.PhotoPath) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PhotoPath);
    }
    if (null == this.Salary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Salary);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.EmployeeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.EmployeeID);
    }
    if (null == this.LastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LastName);
    }
    if (null == this.FirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FirstName);
    }
    if (null == this.Title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Title);
    }
    if (null == this.TitleOfCourtesy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TitleOfCourtesy);
    }
    if (null == this.BirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.BirthDate.getTime());
    __dataOut.writeInt(this.BirthDate.getNanos());
    }
    if (null == this.HireDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HireDate.getTime());
    __dataOut.writeInt(this.HireDate.getNanos());
    }
    if (null == this.Address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Address);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.PostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PostalCode);
    }
    if (null == this.Country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country);
    }
    if (null == this.HomePhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HomePhone);
    }
    if (null == this.Extension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Extension);
    }
    if (null == this.Photo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.Photo, __dataOut);
    }
    if (null == this.Notes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Notes);
    }
    if (null == this.ReportsTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReportsTo);
    }
    if (null == this.PhotoPath) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PhotoPath);
    }
    if (null == this.Salary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Salary);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(EmployeeID==null?"null":"" + EmployeeID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LastName==null?"null":LastName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstName==null?"null":FirstName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Title==null?"null":Title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TitleOfCourtesy==null?"null":TitleOfCourtesy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BirthDate==null?"null":"" + BirthDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HireDate==null?"null":"" + HireDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Address==null?"null":Address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Region==null?"null":Region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PostalCode==null?"null":PostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Country==null?"null":Country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HomePhone==null?"null":HomePhone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Extension==null?"null":Extension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Photo==null?"null":"" + Photo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Notes==null?"null":Notes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReportsTo==null?"null":"" + ReportsTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PhotoPath==null?"null":PhotoPath, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Salary==null?"null":"" + Salary, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(EmployeeID==null?"null":"" + EmployeeID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LastName==null?"null":LastName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstName==null?"null":FirstName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Title==null?"null":Title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TitleOfCourtesy==null?"null":TitleOfCourtesy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BirthDate==null?"null":"" + BirthDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HireDate==null?"null":"" + HireDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Address==null?"null":Address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Region==null?"null":Region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PostalCode==null?"null":PostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Country==null?"null":Country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HomePhone==null?"null":HomePhone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Extension==null?"null":Extension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Photo==null?"null":"" + Photo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Notes==null?"null":Notes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReportsTo==null?"null":"" + ReportsTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PhotoPath==null?"null":PhotoPath, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Salary==null?"null":"" + Salary, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmployeeID = null; } else {
      this.EmployeeID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LastName = null; } else {
      this.LastName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FirstName = null; } else {
      this.FirstName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Title = null; } else {
      this.Title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TitleOfCourtesy = null; } else {
      this.TitleOfCourtesy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BirthDate = null; } else {
      this.BirthDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HireDate = null; } else {
      this.HireDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Address = null; } else {
      this.Address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PostalCode = null; } else {
      this.PostalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Country = null; } else {
      this.Country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HomePhone = null; } else {
      this.HomePhone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Extension = null; } else {
      this.Extension = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Photo = null; } else {
      this.Photo = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Notes = null; } else {
      this.Notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReportsTo = null; } else {
      this.ReportsTo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PhotoPath = null; } else {
      this.PhotoPath = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Salary = null; } else {
      this.Salary = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmployeeID = null; } else {
      this.EmployeeID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LastName = null; } else {
      this.LastName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FirstName = null; } else {
      this.FirstName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Title = null; } else {
      this.Title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TitleOfCourtesy = null; } else {
      this.TitleOfCourtesy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BirthDate = null; } else {
      this.BirthDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HireDate = null; } else {
      this.HireDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Address = null; } else {
      this.Address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PostalCode = null; } else {
      this.PostalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Country = null; } else {
      this.Country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HomePhone = null; } else {
      this.HomePhone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Extension = null; } else {
      this.Extension = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Photo = null; } else {
      this.Photo = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Notes = null; } else {
      this.Notes = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReportsTo = null; } else {
      this.ReportsTo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PhotoPath = null; } else {
      this.PhotoPath = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Salary = null; } else {
      this.Salary = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    Employees o = (Employees) super.clone();
    o.BirthDate = (o.BirthDate != null) ? (java.sql.Timestamp) o.BirthDate.clone() : null;
    o.HireDate = (o.HireDate != null) ? (java.sql.Timestamp) o.HireDate.clone() : null;
    o.Photo = (o.Photo != null) ? (com.cloudera.sqoop.lib.BlobRef) o.Photo.clone() : null;
    return o;
  }

  public void clone0(Employees o) throws CloneNotSupportedException {
    o.BirthDate = (o.BirthDate != null) ? (java.sql.Timestamp) o.BirthDate.clone() : null;
    o.HireDate = (o.HireDate != null) ? (java.sql.Timestamp) o.HireDate.clone() : null;
    o.Photo = (o.Photo != null) ? (com.cloudera.sqoop.lib.BlobRef) o.Photo.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("EmployeeID", this.EmployeeID);
    __sqoop$field_map.put("LastName", this.LastName);
    __sqoop$field_map.put("FirstName", this.FirstName);
    __sqoop$field_map.put("Title", this.Title);
    __sqoop$field_map.put("TitleOfCourtesy", this.TitleOfCourtesy);
    __sqoop$field_map.put("BirthDate", this.BirthDate);
    __sqoop$field_map.put("HireDate", this.HireDate);
    __sqoop$field_map.put("Address", this.Address);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("HomePhone", this.HomePhone);
    __sqoop$field_map.put("Extension", this.Extension);
    __sqoop$field_map.put("Photo", this.Photo);
    __sqoop$field_map.put("Notes", this.Notes);
    __sqoop$field_map.put("ReportsTo", this.ReportsTo);
    __sqoop$field_map.put("PhotoPath", this.PhotoPath);
    __sqoop$field_map.put("Salary", this.Salary);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("EmployeeID", this.EmployeeID);
    __sqoop$field_map.put("LastName", this.LastName);
    __sqoop$field_map.put("FirstName", this.FirstName);
    __sqoop$field_map.put("Title", this.Title);
    __sqoop$field_map.put("TitleOfCourtesy", this.TitleOfCourtesy);
    __sqoop$field_map.put("BirthDate", this.BirthDate);
    __sqoop$field_map.put("HireDate", this.HireDate);
    __sqoop$field_map.put("Address", this.Address);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("HomePhone", this.HomePhone);
    __sqoop$field_map.put("Extension", this.Extension);
    __sqoop$field_map.put("Photo", this.Photo);
    __sqoop$field_map.put("Notes", this.Notes);
    __sqoop$field_map.put("ReportsTo", this.ReportsTo);
    __sqoop$field_map.put("PhotoPath", this.PhotoPath);
    __sqoop$field_map.put("Salary", this.Salary);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
