// ORM class for table 'metrics'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Oct 13 22:25:37 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
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

public class metrics extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("date_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.date_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("aqi", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.aqi = (java.math.BigDecimal)value;
      }
    });
    setters.put("so2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.so2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("co", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.co = (java.math.BigDecimal)value;
      }
    });
    setters.put("o3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.o3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("o3_8hr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.o3_8hr = (java.math.BigDecimal)value;
      }
    });
    setters.put("pm10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.pm10 = (java.math.BigDecimal)value;
      }
    });
    setters.put("pm2_5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.pm2_5 = (java.math.BigDecimal)value;
      }
    });
    setters.put("no2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.no2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("nox", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.nox = (java.math.BigDecimal)value;
      }
    });
    setters.put("no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.no = (java.math.BigDecimal)value;
      }
    });
    setters.put("windspeed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.windspeed = (java.math.BigDecimal)value;
      }
    });
    setters.put("winddirec", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.winddirec = (java.math.BigDecimal)value;
      }
    });
    setters.put("co_8hr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.co_8hr = (java.math.BigDecimal)value;
      }
    });
    setters.put("pm2_5_avg", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.pm2_5_avg = (java.math.BigDecimal)value;
      }
    });
    setters.put("pm10_avg", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.pm10_avg = (java.math.BigDecimal)value;
      }
    });
    setters.put("so2_avg", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.so2_avg = (java.math.BigDecimal)value;
      }
    });
    setters.put("sid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.sid = (Integer)value;
      }
    });
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        metrics.this.id = (Integer)value;
      }
    });
  }
  public metrics() {
    init0();
  }
  private java.sql.Timestamp date_time;
  public java.sql.Timestamp get_date_time() {
    return date_time;
  }
  public void set_date_time(java.sql.Timestamp date_time) {
    this.date_time = date_time;
  }
  public metrics with_date_time(java.sql.Timestamp date_time) {
    this.date_time = date_time;
    return this;
  }
  private java.math.BigDecimal aqi;
  public java.math.BigDecimal get_aqi() {
    return aqi;
  }
  public void set_aqi(java.math.BigDecimal aqi) {
    this.aqi = aqi;
  }
  public metrics with_aqi(java.math.BigDecimal aqi) {
    this.aqi = aqi;
    return this;
  }
  private java.math.BigDecimal so2;
  public java.math.BigDecimal get_so2() {
    return so2;
  }
  public void set_so2(java.math.BigDecimal so2) {
    this.so2 = so2;
  }
  public metrics with_so2(java.math.BigDecimal so2) {
    this.so2 = so2;
    return this;
  }
  private java.math.BigDecimal co;
  public java.math.BigDecimal get_co() {
    return co;
  }
  public void set_co(java.math.BigDecimal co) {
    this.co = co;
  }
  public metrics with_co(java.math.BigDecimal co) {
    this.co = co;
    return this;
  }
  private java.math.BigDecimal o3;
  public java.math.BigDecimal get_o3() {
    return o3;
  }
  public void set_o3(java.math.BigDecimal o3) {
    this.o3 = o3;
  }
  public metrics with_o3(java.math.BigDecimal o3) {
    this.o3 = o3;
    return this;
  }
  private java.math.BigDecimal o3_8hr;
  public java.math.BigDecimal get_o3_8hr() {
    return o3_8hr;
  }
  public void set_o3_8hr(java.math.BigDecimal o3_8hr) {
    this.o3_8hr = o3_8hr;
  }
  public metrics with_o3_8hr(java.math.BigDecimal o3_8hr) {
    this.o3_8hr = o3_8hr;
    return this;
  }
  private java.math.BigDecimal pm10;
  public java.math.BigDecimal get_pm10() {
    return pm10;
  }
  public void set_pm10(java.math.BigDecimal pm10) {
    this.pm10 = pm10;
  }
  public metrics with_pm10(java.math.BigDecimal pm10) {
    this.pm10 = pm10;
    return this;
  }
  private java.math.BigDecimal pm2_5;
  public java.math.BigDecimal get_pm2_5() {
    return pm2_5;
  }
  public void set_pm2_5(java.math.BigDecimal pm2_5) {
    this.pm2_5 = pm2_5;
  }
  public metrics with_pm2_5(java.math.BigDecimal pm2_5) {
    this.pm2_5 = pm2_5;
    return this;
  }
  private java.math.BigDecimal no2;
  public java.math.BigDecimal get_no2() {
    return no2;
  }
  public void set_no2(java.math.BigDecimal no2) {
    this.no2 = no2;
  }
  public metrics with_no2(java.math.BigDecimal no2) {
    this.no2 = no2;
    return this;
  }
  private java.math.BigDecimal nox;
  public java.math.BigDecimal get_nox() {
    return nox;
  }
  public void set_nox(java.math.BigDecimal nox) {
    this.nox = nox;
  }
  public metrics with_nox(java.math.BigDecimal nox) {
    this.nox = nox;
    return this;
  }
  private java.math.BigDecimal no;
  public java.math.BigDecimal get_no() {
    return no;
  }
  public void set_no(java.math.BigDecimal no) {
    this.no = no;
  }
  public metrics with_no(java.math.BigDecimal no) {
    this.no = no;
    return this;
  }
  private java.math.BigDecimal windspeed;
  public java.math.BigDecimal get_windspeed() {
    return windspeed;
  }
  public void set_windspeed(java.math.BigDecimal windspeed) {
    this.windspeed = windspeed;
  }
  public metrics with_windspeed(java.math.BigDecimal windspeed) {
    this.windspeed = windspeed;
    return this;
  }
  private java.math.BigDecimal winddirec;
  public java.math.BigDecimal get_winddirec() {
    return winddirec;
  }
  public void set_winddirec(java.math.BigDecimal winddirec) {
    this.winddirec = winddirec;
  }
  public metrics with_winddirec(java.math.BigDecimal winddirec) {
    this.winddirec = winddirec;
    return this;
  }
  private java.math.BigDecimal co_8hr;
  public java.math.BigDecimal get_co_8hr() {
    return co_8hr;
  }
  public void set_co_8hr(java.math.BigDecimal co_8hr) {
    this.co_8hr = co_8hr;
  }
  public metrics with_co_8hr(java.math.BigDecimal co_8hr) {
    this.co_8hr = co_8hr;
    return this;
  }
  private java.math.BigDecimal pm2_5_avg;
  public java.math.BigDecimal get_pm2_5_avg() {
    return pm2_5_avg;
  }
  public void set_pm2_5_avg(java.math.BigDecimal pm2_5_avg) {
    this.pm2_5_avg = pm2_5_avg;
  }
  public metrics with_pm2_5_avg(java.math.BigDecimal pm2_5_avg) {
    this.pm2_5_avg = pm2_5_avg;
    return this;
  }
  private java.math.BigDecimal pm10_avg;
  public java.math.BigDecimal get_pm10_avg() {
    return pm10_avg;
  }
  public void set_pm10_avg(java.math.BigDecimal pm10_avg) {
    this.pm10_avg = pm10_avg;
  }
  public metrics with_pm10_avg(java.math.BigDecimal pm10_avg) {
    this.pm10_avg = pm10_avg;
    return this;
  }
  private java.math.BigDecimal so2_avg;
  public java.math.BigDecimal get_so2_avg() {
    return so2_avg;
  }
  public void set_so2_avg(java.math.BigDecimal so2_avg) {
    this.so2_avg = so2_avg;
  }
  public metrics with_so2_avg(java.math.BigDecimal so2_avg) {
    this.so2_avg = so2_avg;
    return this;
  }
  private Integer sid;
  public Integer get_sid() {
    return sid;
  }
  public void set_sid(Integer sid) {
    this.sid = sid;
  }
  public metrics with_sid(Integer sid) {
    this.sid = sid;
    return this;
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public metrics with_id(Integer id) {
    this.id = id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof metrics)) {
      return false;
    }
    metrics that = (metrics) o;
    boolean equal = true;
    equal = equal && (this.date_time == null ? that.date_time == null : this.date_time.equals(that.date_time));
    equal = equal && (this.aqi == null ? that.aqi == null : this.aqi.equals(that.aqi));
    equal = equal && (this.so2 == null ? that.so2 == null : this.so2.equals(that.so2));
    equal = equal && (this.co == null ? that.co == null : this.co.equals(that.co));
    equal = equal && (this.o3 == null ? that.o3 == null : this.o3.equals(that.o3));
    equal = equal && (this.o3_8hr == null ? that.o3_8hr == null : this.o3_8hr.equals(that.o3_8hr));
    equal = equal && (this.pm10 == null ? that.pm10 == null : this.pm10.equals(that.pm10));
    equal = equal && (this.pm2_5 == null ? that.pm2_5 == null : this.pm2_5.equals(that.pm2_5));
    equal = equal && (this.no2 == null ? that.no2 == null : this.no2.equals(that.no2));
    equal = equal && (this.nox == null ? that.nox == null : this.nox.equals(that.nox));
    equal = equal && (this.no == null ? that.no == null : this.no.equals(that.no));
    equal = equal && (this.windspeed == null ? that.windspeed == null : this.windspeed.equals(that.windspeed));
    equal = equal && (this.winddirec == null ? that.winddirec == null : this.winddirec.equals(that.winddirec));
    equal = equal && (this.co_8hr == null ? that.co_8hr == null : this.co_8hr.equals(that.co_8hr));
    equal = equal && (this.pm2_5_avg == null ? that.pm2_5_avg == null : this.pm2_5_avg.equals(that.pm2_5_avg));
    equal = equal && (this.pm10_avg == null ? that.pm10_avg == null : this.pm10_avg.equals(that.pm10_avg));
    equal = equal && (this.so2_avg == null ? that.so2_avg == null : this.so2_avg.equals(that.so2_avg));
    equal = equal && (this.sid == null ? that.sid == null : this.sid.equals(that.sid));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof metrics)) {
      return false;
    }
    metrics that = (metrics) o;
    boolean equal = true;
    equal = equal && (this.date_time == null ? that.date_time == null : this.date_time.equals(that.date_time));
    equal = equal && (this.aqi == null ? that.aqi == null : this.aqi.equals(that.aqi));
    equal = equal && (this.so2 == null ? that.so2 == null : this.so2.equals(that.so2));
    equal = equal && (this.co == null ? that.co == null : this.co.equals(that.co));
    equal = equal && (this.o3 == null ? that.o3 == null : this.o3.equals(that.o3));
    equal = equal && (this.o3_8hr == null ? that.o3_8hr == null : this.o3_8hr.equals(that.o3_8hr));
    equal = equal && (this.pm10 == null ? that.pm10 == null : this.pm10.equals(that.pm10));
    equal = equal && (this.pm2_5 == null ? that.pm2_5 == null : this.pm2_5.equals(that.pm2_5));
    equal = equal && (this.no2 == null ? that.no2 == null : this.no2.equals(that.no2));
    equal = equal && (this.nox == null ? that.nox == null : this.nox.equals(that.nox));
    equal = equal && (this.no == null ? that.no == null : this.no.equals(that.no));
    equal = equal && (this.windspeed == null ? that.windspeed == null : this.windspeed.equals(that.windspeed));
    equal = equal && (this.winddirec == null ? that.winddirec == null : this.winddirec.equals(that.winddirec));
    equal = equal && (this.co_8hr == null ? that.co_8hr == null : this.co_8hr.equals(that.co_8hr));
    equal = equal && (this.pm2_5_avg == null ? that.pm2_5_avg == null : this.pm2_5_avg.equals(that.pm2_5_avg));
    equal = equal && (this.pm10_avg == null ? that.pm10_avg == null : this.pm10_avg.equals(that.pm10_avg));
    equal = equal && (this.so2_avg == null ? that.so2_avg == null : this.so2_avg.equals(that.so2_avg));
    equal = equal && (this.sid == null ? that.sid == null : this.sid.equals(that.sid));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.date_time = JdbcWritableBridge.readTimestamp(1, __dbResults);
    this.aqi = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.so2 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.co = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.o3 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.o3_8hr = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.pm10 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.pm2_5 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.no2 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.nox = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.no = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.windspeed = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.winddirec = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.co_8hr = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.pm2_5_avg = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.pm10_avg = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.so2_avg = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.sid = JdbcWritableBridge.readInteger(18, __dbResults);
    this.id = JdbcWritableBridge.readInteger(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.date_time = JdbcWritableBridge.readTimestamp(1, __dbResults);
    this.aqi = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.so2 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.co = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.o3 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.o3_8hr = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.pm10 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.pm2_5 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.no2 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.nox = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.no = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.windspeed = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.winddirec = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.co_8hr = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.pm2_5_avg = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.pm10_avg = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.so2_avg = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.sid = JdbcWritableBridge.readInteger(18, __dbResults);
    this.id = JdbcWritableBridge.readInteger(19, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(date_time, 1 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(aqi, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(so2, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(o3, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(o3_8hr, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm10, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm2_5, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(no2, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(nox, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(no, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(windspeed, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(winddirec, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co_8hr, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm2_5_avg, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm10_avg, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(so2_avg, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeInteger(sid, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id, 19 + __off, 4, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeTimestamp(date_time, 1 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(aqi, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(so2, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(o3, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(o3_8hr, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm10, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm2_5, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(no2, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(nox, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(no, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(windspeed, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(winddirec, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co_8hr, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm2_5_avg, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pm10_avg, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(so2_avg, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeInteger(sid, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id, 19 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.date_time = null;
    } else {
    this.date_time = new Timestamp(__dataIn.readLong());
    this.date_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.aqi = null;
    } else {
    this.aqi = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.so2 = null;
    } else {
    this.so2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.co = null;
    } else {
    this.co = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.o3 = null;
    } else {
    this.o3 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.o3_8hr = null;
    } else {
    this.o3_8hr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pm10 = null;
    } else {
    this.pm10 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pm2_5 = null;
    } else {
    this.pm2_5 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.no2 = null;
    } else {
    this.no2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.nox = null;
    } else {
    this.nox = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.no = null;
    } else {
    this.no = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.windspeed = null;
    } else {
    this.windspeed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.winddirec = null;
    } else {
    this.winddirec = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.co_8hr = null;
    } else {
    this.co_8hr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pm2_5_avg = null;
    } else {
    this.pm2_5_avg = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pm10_avg = null;
    } else {
    this.pm10_avg = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.so2_avg = null;
    } else {
    this.so2_avg = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sid = null;
    } else {
    this.sid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.date_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_time.getTime());
    __dataOut.writeInt(this.date_time.getNanos());
    }
    if (null == this.aqi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.aqi, __dataOut);
    }
    if (null == this.so2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.so2, __dataOut);
    }
    if (null == this.co) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.co, __dataOut);
    }
    if (null == this.o3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.o3, __dataOut);
    }
    if (null == this.o3_8hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.o3_8hr, __dataOut);
    }
    if (null == this.pm10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm10, __dataOut);
    }
    if (null == this.pm2_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm2_5, __dataOut);
    }
    if (null == this.no2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.no2, __dataOut);
    }
    if (null == this.nox) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.nox, __dataOut);
    }
    if (null == this.no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.no, __dataOut);
    }
    if (null == this.windspeed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.windspeed, __dataOut);
    }
    if (null == this.winddirec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.winddirec, __dataOut);
    }
    if (null == this.co_8hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.co_8hr, __dataOut);
    }
    if (null == this.pm2_5_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm2_5_avg, __dataOut);
    }
    if (null == this.pm10_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm10_avg, __dataOut);
    }
    if (null == this.so2_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.so2_avg, __dataOut);
    }
    if (null == this.sid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sid);
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.date_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_time.getTime());
    __dataOut.writeInt(this.date_time.getNanos());
    }
    if (null == this.aqi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.aqi, __dataOut);
    }
    if (null == this.so2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.so2, __dataOut);
    }
    if (null == this.co) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.co, __dataOut);
    }
    if (null == this.o3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.o3, __dataOut);
    }
    if (null == this.o3_8hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.o3_8hr, __dataOut);
    }
    if (null == this.pm10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm10, __dataOut);
    }
    if (null == this.pm2_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm2_5, __dataOut);
    }
    if (null == this.no2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.no2, __dataOut);
    }
    if (null == this.nox) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.nox, __dataOut);
    }
    if (null == this.no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.no, __dataOut);
    }
    if (null == this.windspeed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.windspeed, __dataOut);
    }
    if (null == this.winddirec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.winddirec, __dataOut);
    }
    if (null == this.co_8hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.co_8hr, __dataOut);
    }
    if (null == this.pm2_5_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm2_5_avg, __dataOut);
    }
    if (null == this.pm10_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pm10_avg, __dataOut);
    }
    if (null == this.so2_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.so2_avg, __dataOut);
    }
    if (null == this.sid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sid);
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
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
    __sb.append(FieldFormatter.escapeAndEnclose(date_time==null?"null":"" + date_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(aqi==null?"null":aqi.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2==null?"null":so2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co==null?"null":co.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3==null?"null":o3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3_8hr==null?"null":o3_8hr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10==null?"null":pm10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5==null?"null":pm2_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no2==null?"null":no2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nox==null?"null":nox.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no==null?"null":no.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windspeed==null?"null":windspeed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(winddirec==null?"null":winddirec.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co_8hr==null?"null":co_8hr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5_avg==null?"null":pm2_5_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10_avg==null?"null":pm10_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2_avg==null?"null":so2_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sid==null?"null":"" + sid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(date_time==null?"null":"" + date_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(aqi==null?"null":aqi.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2==null?"null":so2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co==null?"null":co.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3==null?"null":o3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3_8hr==null?"null":o3_8hr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10==null?"null":pm10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5==null?"null":pm2_5.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no2==null?"null":no2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nox==null?"null":nox.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no==null?"null":no.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windspeed==null?"null":windspeed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(winddirec==null?"null":winddirec.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co_8hr==null?"null":co_8hr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5_avg==null?"null":pm2_5_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10_avg==null?"null":pm10_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2_avg==null?"null":so2_avg.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sid==null?"null":"" + sid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
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
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_time = null; } else {
      this.date_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.aqi = null; } else {
      this.aqi = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2 = null; } else {
      this.so2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co = null; } else {
      this.co = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3 = null; } else {
      this.o3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3_8hr = null; } else {
      this.o3_8hr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10 = null; } else {
      this.pm10 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5 = null; } else {
      this.pm2_5 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no2 = null; } else {
      this.no2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nox = null; } else {
      this.nox = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no = null; } else {
      this.no = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.windspeed = null; } else {
      this.windspeed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.winddirec = null; } else {
      this.winddirec = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co_8hr = null; } else {
      this.co_8hr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5_avg = null; } else {
      this.pm2_5_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10_avg = null; } else {
      this.pm10_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2_avg = null; } else {
      this.so2_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sid = null; } else {
      this.sid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_time = null; } else {
      this.date_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.aqi = null; } else {
      this.aqi = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2 = null; } else {
      this.so2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co = null; } else {
      this.co = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3 = null; } else {
      this.o3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3_8hr = null; } else {
      this.o3_8hr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10 = null; } else {
      this.pm10 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5 = null; } else {
      this.pm2_5 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no2 = null; } else {
      this.no2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nox = null; } else {
      this.nox = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no = null; } else {
      this.no = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.windspeed = null; } else {
      this.windspeed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.winddirec = null; } else {
      this.winddirec = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co_8hr = null; } else {
      this.co_8hr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5_avg = null; } else {
      this.pm2_5_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10_avg = null; } else {
      this.pm10_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2_avg = null; } else {
      this.so2_avg = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sid = null; } else {
      this.sid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    metrics o = (metrics) super.clone();
    o.date_time = (o.date_time != null) ? (java.sql.Timestamp) o.date_time.clone() : null;
    return o;
  }

  public void clone0(metrics o) throws CloneNotSupportedException {
    o.date_time = (o.date_time != null) ? (java.sql.Timestamp) o.date_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("date_time", this.date_time);
    __sqoop$field_map.put("aqi", this.aqi);
    __sqoop$field_map.put("so2", this.so2);
    __sqoop$field_map.put("co", this.co);
    __sqoop$field_map.put("o3", this.o3);
    __sqoop$field_map.put("o3_8hr", this.o3_8hr);
    __sqoop$field_map.put("pm10", this.pm10);
    __sqoop$field_map.put("pm2_5", this.pm2_5);
    __sqoop$field_map.put("no2", this.no2);
    __sqoop$field_map.put("nox", this.nox);
    __sqoop$field_map.put("no", this.no);
    __sqoop$field_map.put("windspeed", this.windspeed);
    __sqoop$field_map.put("winddirec", this.winddirec);
    __sqoop$field_map.put("co_8hr", this.co_8hr);
    __sqoop$field_map.put("pm2_5_avg", this.pm2_5_avg);
    __sqoop$field_map.put("pm10_avg", this.pm10_avg);
    __sqoop$field_map.put("so2_avg", this.so2_avg);
    __sqoop$field_map.put("sid", this.sid);
    __sqoop$field_map.put("id", this.id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("date_time", this.date_time);
    __sqoop$field_map.put("aqi", this.aqi);
    __sqoop$field_map.put("so2", this.so2);
    __sqoop$field_map.put("co", this.co);
    __sqoop$field_map.put("o3", this.o3);
    __sqoop$field_map.put("o3_8hr", this.o3_8hr);
    __sqoop$field_map.put("pm10", this.pm10);
    __sqoop$field_map.put("pm2_5", this.pm2_5);
    __sqoop$field_map.put("no2", this.no2);
    __sqoop$field_map.put("nox", this.nox);
    __sqoop$field_map.put("no", this.no);
    __sqoop$field_map.put("windspeed", this.windspeed);
    __sqoop$field_map.put("winddirec", this.winddirec);
    __sqoop$field_map.put("co_8hr", this.co_8hr);
    __sqoop$field_map.put("pm2_5_avg", this.pm2_5_avg);
    __sqoop$field_map.put("pm10_avg", this.pm10_avg);
    __sqoop$field_map.put("so2_avg", this.so2_avg);
    __sqoop$field_map.put("sid", this.sid);
    __sqoop$field_map.put("id", this.id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
