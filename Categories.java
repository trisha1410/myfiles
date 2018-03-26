// ORM class for table 'Categories'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Feb 23 18:59:59 UTC 2018
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

public class Categories extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CategoryID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CategoryID = (Integer)value;
      }
    });
    setters.put("CategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CategoryName = (String)value;
      }
    });
    setters.put("Description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Description = (String)value;
      }
    });
    setters.put("Picture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Picture = (com.cloudera.sqoop.lib.BlobRef)value;
      }
    });
  }
  public Categories() {
    init0();
  }
  private Integer CategoryID;
  public Integer get_CategoryID() {
    return CategoryID;
  }
  public void set_CategoryID(Integer CategoryID) {
    this.CategoryID = CategoryID;
  }
  public Categories with_CategoryID(Integer CategoryID) {
    this.CategoryID = CategoryID;
    return this;
  }
  private String CategoryName;
  public String get_CategoryName() {
    return CategoryName;
  }
  public void set_CategoryName(String CategoryName) {
    this.CategoryName = CategoryName;
  }
  public Categories with_CategoryName(String CategoryName) {
    this.CategoryName = CategoryName;
    return this;
  }
  private String Description;
  public String get_Description() {
    return Description;
  }
  public void set_Description(String Description) {
    this.Description = Description;
  }
  public Categories with_Description(String Description) {
    this.Description = Description;
    return this;
  }
  private com.cloudera.sqoop.lib.BlobRef Picture;
  public com.cloudera.sqoop.lib.BlobRef get_Picture() {
    return Picture;
  }
  public void set_Picture(com.cloudera.sqoop.lib.BlobRef Picture) {
    this.Picture = Picture;
  }
  public Categories with_Picture(com.cloudera.sqoop.lib.BlobRef Picture) {
    this.Picture = Picture;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Categories)) {
      return false;
    }
    Categories that = (Categories) o;
    boolean equal = true;
    equal = equal && (this.CategoryID == null ? that.CategoryID == null : this.CategoryID.equals(that.CategoryID));
    equal = equal && (this.CategoryName == null ? that.CategoryName == null : this.CategoryName.equals(that.CategoryName));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.Picture == null ? that.Picture == null : this.Picture.equals(that.Picture));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Categories)) {
      return false;
    }
    Categories that = (Categories) o;
    boolean equal = true;
    equal = equal && (this.CategoryID == null ? that.CategoryID == null : this.CategoryID.equals(that.CategoryID));
    equal = equal && (this.CategoryName == null ? that.CategoryName == null : this.CategoryName.equals(that.CategoryName));
    equal = equal && (this.Description == null ? that.Description == null : this.Description.equals(that.Description));
    equal = equal && (this.Picture == null ? that.Picture == null : this.Picture.equals(that.Picture));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CategoryID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CategoryName = JdbcWritableBridge.readString(2, __dbResults);
    this.Description = JdbcWritableBridge.readString(3, __dbResults);
    this.Picture = JdbcWritableBridge.readBlobRef(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CategoryID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CategoryName = JdbcWritableBridge.readString(2, __dbResults);
    this.Description = JdbcWritableBridge.readString(3, __dbResults);
    this.Picture = JdbcWritableBridge.readBlobRef(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.Picture = __loader.readBlobRef(4, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.Picture = __loader.readBlobRef(4, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CategoryID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CategoryName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Description, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBlobRef(Picture, 4 + __off, -4, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CategoryID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CategoryName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Description, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBlobRef(Picture, 4 + __off, -4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CategoryID = null;
    } else {
    this.CategoryID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CategoryName = null;
    } else {
    this.CategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Description = null;
    } else {
    this.Description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Picture = null;
    } else {
    this.Picture = com.cloudera.sqoop.lib.LobSerializer.readBlobFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CategoryID);
    }
    if (null == this.CategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CategoryName);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.Picture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.Picture, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CategoryID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CategoryID);
    }
    if (null == this.CategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CategoryName);
    }
    if (null == this.Description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Description);
    }
    if (null == this.Picture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.Picture, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryID==null?"null":"" + CategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryName==null?"null":CategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Picture==null?"null":"" + Picture, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryID==null?"null":"" + CategoryID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CategoryName==null?"null":CategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Description==null?"null":Description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Picture==null?"null":"" + Picture, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CategoryID = null; } else {
      this.CategoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CategoryName = null; } else {
      this.CategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Picture = null; } else {
      this.Picture = BlobRef.parse(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CategoryID = null; } else {
      this.CategoryID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CategoryName = null; } else {
      this.CategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Description = null; } else {
      this.Description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Picture = null; } else {
      this.Picture = BlobRef.parse(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    Categories o = (Categories) super.clone();
    o.Picture = (o.Picture != null) ? (com.cloudera.sqoop.lib.BlobRef) o.Picture.clone() : null;
    return o;
  }

  public void clone0(Categories o) throws CloneNotSupportedException {
    o.Picture = (o.Picture != null) ? (com.cloudera.sqoop.lib.BlobRef) o.Picture.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CategoryID", this.CategoryID);
    __sqoop$field_map.put("CategoryName", this.CategoryName);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("Picture", this.Picture);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CategoryID", this.CategoryID);
    __sqoop$field_map.put("CategoryName", this.CategoryName);
    __sqoop$field_map.put("Description", this.Description);
    __sqoop$field_map.put("Picture", this.Picture);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
