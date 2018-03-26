// ORM class for table 'airports_1'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 19 14:12:10 UTC 2018
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

public class airports_1 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("iata", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        iata = (String)value;
      }
    });
    setters.put("airport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        airport = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        city = (String)value;
      }
    });
    setters.put("state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        state = (String)value;
      }
    });
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        country = (String)value;
      }
    });
    setters.put("lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lat = (Double)value;
      }
    });
    setters.put("long", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _long = (Double)value;
      }
    });
  }
  public airports_1() {
    init0();
  }
  private String iata;
  public String get_iata() {
    return iata;
  }
  public void set_iata(String iata) {
    this.iata = iata;
  }
  public airports_1 with_iata(String iata) {
    this.iata = iata;
    return this;
  }
  private String airport;
  public String get_airport() {
    return airport;
  }
  public void set_airport(String airport) {
    this.airport = airport;
  }
  public airports_1 with_airport(String airport) {
    this.airport = airport;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public airports_1 with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public airports_1 with_state(String state) {
    this.state = state;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public airports_1 with_country(String country) {
    this.country = country;
    return this;
  }
  private Double lat;
  public Double get_lat() {
    return lat;
  }
  public void set_lat(Double lat) {
    this.lat = lat;
  }
  public airports_1 with_lat(Double lat) {
    this.lat = lat;
    return this;
  }
  private Double _long;
  public Double get__long() {
    return _long;
  }
  public void set__long(Double _long) {
    this._long = _long;
  }
  public airports_1 with__long(Double _long) {
    this._long = _long;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof airports_1)) {
      return false;
    }
    airports_1 that = (airports_1) o;
    boolean equal = true;
    equal = equal && (this.iata == null ? that.iata == null : this.iata.equals(that.iata));
    equal = equal && (this.airport == null ? that.airport == null : this.airport.equals(that.airport));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this._long == null ? that._long == null : this._long.equals(that._long));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof airports_1)) {
      return false;
    }
    airports_1 that = (airports_1) o;
    boolean equal = true;
    equal = equal && (this.iata == null ? that.iata == null : this.iata.equals(that.iata));
    equal = equal && (this.airport == null ? that.airport == null : this.airport.equals(that.airport));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this._long == null ? that._long == null : this._long.equals(that._long));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.iata = JdbcWritableBridge.readString(1, __dbResults);
    this.airport = JdbcWritableBridge.readString(2, __dbResults);
    this.city = JdbcWritableBridge.readString(3, __dbResults);
    this.state = JdbcWritableBridge.readString(4, __dbResults);
    this.country = JdbcWritableBridge.readString(5, __dbResults);
    this.lat = JdbcWritableBridge.readDouble(6, __dbResults);
    this._long = JdbcWritableBridge.readDouble(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.iata = JdbcWritableBridge.readString(1, __dbResults);
    this.airport = JdbcWritableBridge.readString(2, __dbResults);
    this.city = JdbcWritableBridge.readString(3, __dbResults);
    this.state = JdbcWritableBridge.readString(4, __dbResults);
    this.country = JdbcWritableBridge.readString(5, __dbResults);
    this.lat = JdbcWritableBridge.readDouble(6, __dbResults);
    this._long = JdbcWritableBridge.readDouble(7, __dbResults);
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
    JdbcWritableBridge.writeString(iata, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(airport, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(city, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(state, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeDouble(lat, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(_long, 7 + __off, 8, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(iata, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(airport, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(city, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(state, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeDouble(lat, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(_long, 7 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.iata = null;
    } else {
    this.iata = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.airport = null;
    } else {
    this.airport = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lat = null;
    } else {
    this.lat = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this._long = null;
    } else {
    this._long = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.iata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iata);
    }
    if (null == this.airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airport);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.lat);
    }
    if (null == this._long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this._long);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.iata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iata);
    }
    if (null == this.airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airport);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.lat);
    }
    if (null == this._long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this._long);
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
    __sb.append(FieldFormatter.escapeAndEnclose(iata==null?"null":iata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airport==null?"null":airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":"" + lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_long==null?"null":"" + _long, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(iata==null?"null":iata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airport==null?"null":airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":"" + lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_long==null?"null":"" + _long, delimiters));
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
    if (__cur_str.equals("null")) { this.iata = null; } else {
      this.iata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.airport = null; } else {
      this.airport = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lat = null; } else {
      this.lat = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this._long = null; } else {
      this._long = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.iata = null; } else {
      this.iata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.airport = null; } else {
      this.airport = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lat = null; } else {
      this.lat = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this._long = null; } else {
      this._long = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    airports_1 o = (airports_1) super.clone();
    return o;
  }

  public void clone0(airports_1 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("iata", this.iata);
    __sqoop$field_map.put("airport", this.airport);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("long", this._long);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("iata", this.iata);
    __sqoop$field_map.put("airport", this.airport);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("long", this._long);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
