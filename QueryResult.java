// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jan 17 19:40:46 UTC 2018
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

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("UniqueCarrier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UniqueCarrier = (String)value;
      }
    });
    setters.put("FlightNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FlightNum = (Integer)value;
      }
    });
    setters.put("TailNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TailNum = (String)value;
      }
    });
    setters.put("Origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Origin = (String)value;
      }
    });
    setters.put("Dest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Dest = (String)value;
      }
    });
    setters.put("TaxiIn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TaxiIn = (Integer)value;
      }
    });
    setters.put("TaxiOut", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TaxiOut = (Integer)value;
      }
    });
    setters.put("Cancelled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Cancelled = (Integer)value;
      }
    });
    setters.put("CancellationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CancellationCode = (String)value;
      }
    });
    setters.put("Diverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Diverted = (Integer)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String UniqueCarrier;
  public String get_UniqueCarrier() {
    return UniqueCarrier;
  }
  public void set_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
  }
  public QueryResult with_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
    return this;
  }
  private Integer FlightNum;
  public Integer get_FlightNum() {
    return FlightNum;
  }
  public void set_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
  }
  public QueryResult with_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
    return this;
  }
  private String TailNum;
  public String get_TailNum() {
    return TailNum;
  }
  public void set_TailNum(String TailNum) {
    this.TailNum = TailNum;
  }
  public QueryResult with_TailNum(String TailNum) {
    this.TailNum = TailNum;
    return this;
  }
  private String Origin;
  public String get_Origin() {
    return Origin;
  }
  public void set_Origin(String Origin) {
    this.Origin = Origin;
  }
  public QueryResult with_Origin(String Origin) {
    this.Origin = Origin;
    return this;
  }
  private String Dest;
  public String get_Dest() {
    return Dest;
  }
  public void set_Dest(String Dest) {
    this.Dest = Dest;
  }
  public QueryResult with_Dest(String Dest) {
    this.Dest = Dest;
    return this;
  }
  private Integer TaxiIn;
  public Integer get_TaxiIn() {
    return TaxiIn;
  }
  public void set_TaxiIn(Integer TaxiIn) {
    this.TaxiIn = TaxiIn;
  }
  public QueryResult with_TaxiIn(Integer TaxiIn) {
    this.TaxiIn = TaxiIn;
    return this;
  }
  private Integer TaxiOut;
  public Integer get_TaxiOut() {
    return TaxiOut;
  }
  public void set_TaxiOut(Integer TaxiOut) {
    this.TaxiOut = TaxiOut;
  }
  public QueryResult with_TaxiOut(Integer TaxiOut) {
    this.TaxiOut = TaxiOut;
    return this;
  }
  private Integer Cancelled;
  public Integer get_Cancelled() {
    return Cancelled;
  }
  public void set_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
  }
  public QueryResult with_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
    return this;
  }
  private String CancellationCode;
  public String get_CancellationCode() {
    return CancellationCode;
  }
  public void set_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
  }
  public QueryResult with_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
    return this;
  }
  private Integer Diverted;
  public Integer get_Diverted() {
    return Diverted;
  }
  public void set_Diverted(Integer Diverted) {
    this.Diverted = Diverted;
  }
  public QueryResult with_Diverted(Integer Diverted) {
    this.Diverted = Diverted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.UniqueCarrier = JdbcWritableBridge.readString(1, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(2, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(3, __dbResults);
    this.Origin = JdbcWritableBridge.readString(4, __dbResults);
    this.Dest = JdbcWritableBridge.readString(5, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readInteger(6, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(8, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(9, __dbResults);
    this.Diverted = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.UniqueCarrier = JdbcWritableBridge.readString(1, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(2, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(3, __dbResults);
    this.Origin = JdbcWritableBridge.readString(4, __dbResults);
    this.Dest = JdbcWritableBridge.readString(5, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readInteger(6, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(8, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(9, __dbResults);
    this.Diverted = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeString(UniqueCarrier, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiIn, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiOut, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 9 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(Diverted, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(UniqueCarrier, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiIn, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(TaxiOut, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 9 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(Diverted, 10 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.UniqueCarrier = null;
    } else {
    this.UniqueCarrier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FlightNum = null;
    } else {
    this.FlightNum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TailNum = null;
    } else {
    this.TailNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Origin = null;
    } else {
    this.Origin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Dest = null;
    } else {
    this.Dest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiIn = null;
    } else {
    this.TaxiIn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiOut = null;
    } else {
    this.TaxiOut = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Cancelled = null;
    } else {
    this.Cancelled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CancellationCode = null;
    } else {
    this.CancellationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Diverted = null;
    } else {
    this.Diverted = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiOut);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Diverted);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TaxiOut);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Diverted);
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
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":"" + Diverted, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":"" + Diverted, delimiters));
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
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Diverted = null; } else {
      this.Diverted = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Diverted = null; } else {
      this.Diverted = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Diverted", this.Diverted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Diverted", this.Diverted);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
