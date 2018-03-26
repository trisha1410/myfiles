// ORM class for table 'Customers'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Feb 26 19:03:00 UTC 2018
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

public class Customers extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CustomerID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CustomerID = (String)value;
      }
    });
    setters.put("CompanyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CompanyName = (String)value;
      }
    });
    setters.put("ContactName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ContactName = (String)value;
      }
    });
    setters.put("ContactTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ContactTitle = (String)value;
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
    setters.put("Phone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Phone = (String)value;
      }
    });
    setters.put("Fax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Fax = (String)value;
      }
    });
  }
  public Customers() {
    init0();
  }
  private String CustomerID;
  public String get_CustomerID() {
    return CustomerID;
  }
  public void set_CustomerID(String CustomerID) {
    this.CustomerID = CustomerID;
  }
  public Customers with_CustomerID(String CustomerID) {
    this.CustomerID = CustomerID;
    return this;
  }
  private String CompanyName;
  public String get_CompanyName() {
    return CompanyName;
  }
  public void set_CompanyName(String CompanyName) {
    this.CompanyName = CompanyName;
  }
  public Customers with_CompanyName(String CompanyName) {
    this.CompanyName = CompanyName;
    return this;
  }
  private String ContactName;
  public String get_ContactName() {
    return ContactName;
  }
  public void set_ContactName(String ContactName) {
    this.ContactName = ContactName;
  }
  public Customers with_ContactName(String ContactName) {
    this.ContactName = ContactName;
    return this;
  }
  private String ContactTitle;
  public String get_ContactTitle() {
    return ContactTitle;
  }
  public void set_ContactTitle(String ContactTitle) {
    this.ContactTitle = ContactTitle;
  }
  public Customers with_ContactTitle(String ContactTitle) {
    this.ContactTitle = ContactTitle;
    return this;
  }
  private String Address;
  public String get_Address() {
    return Address;
  }
  public void set_Address(String Address) {
    this.Address = Address;
  }
  public Customers with_Address(String Address) {
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
  public Customers with_City(String City) {
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
  public Customers with_Region(String Region) {
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
  public Customers with_PostalCode(String PostalCode) {
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
  public Customers with_Country(String Country) {
    this.Country = Country;
    return this;
  }
  private String Phone;
  public String get_Phone() {
    return Phone;
  }
  public void set_Phone(String Phone) {
    this.Phone = Phone;
  }
  public Customers with_Phone(String Phone) {
    this.Phone = Phone;
    return this;
  }
  private String Fax;
  public String get_Fax() {
    return Fax;
  }
  public void set_Fax(String Fax) {
    this.Fax = Fax;
  }
  public Customers with_Fax(String Fax) {
    this.Fax = Fax;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customers)) {
      return false;
    }
    Customers that = (Customers) o;
    boolean equal = true;
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.CompanyName == null ? that.CompanyName == null : this.CompanyName.equals(that.CompanyName));
    equal = equal && (this.ContactName == null ? that.ContactName == null : this.ContactName.equals(that.ContactName));
    equal = equal && (this.ContactTitle == null ? that.ContactTitle == null : this.ContactTitle.equals(that.ContactTitle));
    equal = equal && (this.Address == null ? that.Address == null : this.Address.equals(that.Address));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.Phone == null ? that.Phone == null : this.Phone.equals(that.Phone));
    equal = equal && (this.Fax == null ? that.Fax == null : this.Fax.equals(that.Fax));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customers)) {
      return false;
    }
    Customers that = (Customers) o;
    boolean equal = true;
    equal = equal && (this.CustomerID == null ? that.CustomerID == null : this.CustomerID.equals(that.CustomerID));
    equal = equal && (this.CompanyName == null ? that.CompanyName == null : this.CompanyName.equals(that.CompanyName));
    equal = equal && (this.ContactName == null ? that.ContactName == null : this.ContactName.equals(that.ContactName));
    equal = equal && (this.ContactTitle == null ? that.ContactTitle == null : this.ContactTitle.equals(that.ContactTitle));
    equal = equal && (this.Address == null ? that.Address == null : this.Address.equals(that.Address));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.Phone == null ? that.Phone == null : this.Phone.equals(that.Phone));
    equal = equal && (this.Fax == null ? that.Fax == null : this.Fax.equals(that.Fax));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CustomerID = JdbcWritableBridge.readString(1, __dbResults);
    this.CompanyName = JdbcWritableBridge.readString(2, __dbResults);
    this.ContactName = JdbcWritableBridge.readString(3, __dbResults);
    this.ContactTitle = JdbcWritableBridge.readString(4, __dbResults);
    this.Address = JdbcWritableBridge.readString(5, __dbResults);
    this.City = JdbcWritableBridge.readString(6, __dbResults);
    this.Region = JdbcWritableBridge.readString(7, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(8, __dbResults);
    this.Country = JdbcWritableBridge.readString(9, __dbResults);
    this.Phone = JdbcWritableBridge.readString(10, __dbResults);
    this.Fax = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CustomerID = JdbcWritableBridge.readString(1, __dbResults);
    this.CompanyName = JdbcWritableBridge.readString(2, __dbResults);
    this.ContactName = JdbcWritableBridge.readString(3, __dbResults);
    this.ContactTitle = JdbcWritableBridge.readString(4, __dbResults);
    this.Address = JdbcWritableBridge.readString(5, __dbResults);
    this.City = JdbcWritableBridge.readString(6, __dbResults);
    this.Region = JdbcWritableBridge.readString(7, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(8, __dbResults);
    this.Country = JdbcWritableBridge.readString(9, __dbResults);
    this.Phone = JdbcWritableBridge.readString(10, __dbResults);
    this.Fax = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CustomerID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CompanyName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactTitle, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Phone, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Fax, 11 + __off, 12, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CustomerID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CompanyName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactTitle, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Phone, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Fax, 11 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CustomerID = null;
    } else {
    this.CustomerID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CompanyName = null;
    } else {
    this.CompanyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ContactName = null;
    } else {
    this.ContactName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ContactTitle = null;
    } else {
    this.ContactTitle = Text.readString(__dataIn);
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
        this.Phone = null;
    } else {
    this.Phone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Fax = null;
    } else {
    this.Fax = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerID);
    }
    if (null == this.CompanyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CompanyName);
    }
    if (null == this.ContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactName);
    }
    if (null == this.ContactTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactTitle);
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
    if (null == this.Phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Phone);
    }
    if (null == this.Fax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fax);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerID);
    }
    if (null == this.CompanyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CompanyName);
    }
    if (null == this.ContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactName);
    }
    if (null == this.ContactTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactTitle);
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
    if (null == this.Phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Phone);
    }
    if (null == this.Fax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fax);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CompanyName==null?"null":CompanyName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactName==null?"null":ContactName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactTitle==null?"null":ContactTitle, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Phone==null?"null":Phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fax==null?"null":Fax, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerID==null?"null":CustomerID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CompanyName==null?"null":CompanyName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactName==null?"null":ContactName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactTitle==null?"null":ContactTitle, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(Phone==null?"null":Phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fax==null?"null":Fax, delimiters));
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
    if (__cur_str.equals("null")) { this.CustomerID = null; } else {
      this.CustomerID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CompanyName = null; } else {
      this.CompanyName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ContactName = null; } else {
      this.ContactName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ContactTitle = null; } else {
      this.ContactTitle = __cur_str;
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
    if (__cur_str.equals("null")) { this.Phone = null; } else {
      this.Phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Fax = null; } else {
      this.Fax = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerID = null; } else {
      this.CustomerID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CompanyName = null; } else {
      this.CompanyName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ContactName = null; } else {
      this.ContactName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ContactTitle = null; } else {
      this.ContactTitle = __cur_str;
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
    if (__cur_str.equals("null")) { this.Phone = null; } else {
      this.Phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Fax = null; } else {
      this.Fax = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    Customers o = (Customers) super.clone();
    return o;
  }

  public void clone0(Customers o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("CompanyName", this.CompanyName);
    __sqoop$field_map.put("ContactName", this.ContactName);
    __sqoop$field_map.put("ContactTitle", this.ContactTitle);
    __sqoop$field_map.put("Address", this.Address);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("Phone", this.Phone);
    __sqoop$field_map.put("Fax", this.Fax);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CustomerID", this.CustomerID);
    __sqoop$field_map.put("CompanyName", this.CompanyName);
    __sqoop$field_map.put("ContactName", this.ContactName);
    __sqoop$field_map.put("ContactTitle", this.ContactTitle);
    __sqoop$field_map.put("Address", this.Address);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("Phone", this.Phone);
    __sqoop$field_map.put("Fax", this.Fax);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
