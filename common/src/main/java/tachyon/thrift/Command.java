/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-14")
public class Command implements org.apache.thrift.TBase<Command, Command._Fields>, java.io.Serializable, Cloneable, Comparable<Command> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Command");

  private static final org.apache.thrift.protocol.TField COMMAND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("commandType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommandStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommandTupleSchemeFactory());
  }

  /**
   * 
   * @see CommandType
   */
  public CommandType commandType; // required
  public List<Long> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see CommandType
     */
    COMMAND_TYPE((short)1, "commandType"),
    DATA((short)2, "data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMMAND_TYPE
          return COMMAND_TYPE;
        case 2: // DATA
          return DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMAND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("commandType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CommandType.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Command.class, metaDataMap);
  }

  public Command() {
  }

  public Command(
    CommandType commandType,
    List<Long> data)
  {
    this();
    this.commandType = commandType;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Command(Command other) {
    if (other.isSetCommandType()) {
      this.commandType = other.commandType;
    }
    if (other.isSetData()) {
      List<Long> __this__data = new ArrayList<Long>(other.data);
      this.data = __this__data;
    }
  }

  public Command deepCopy() {
    return new Command(this);
  }

  @Override
  public void clear() {
    this.commandType = null;
    this.data = null;
  }

  /**
   * 
   * @see CommandType
   */
  public CommandType getCommandType() {
    return this.commandType;
  }

  /**
   * 
   * @see CommandType
   */
  public Command setCommandType(CommandType commandType) {
    this.commandType = commandType;
    return this;
  }

  public void unsetCommandType() {
    this.commandType = null;
  }

  /** Returns true if field commandType is set (has been assigned a value) and false otherwise */
  public boolean isSetCommandType() {
    return this.commandType != null;
  }

  public void setCommandTypeIsSet(boolean value) {
    if (!value) {
      this.commandType = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<Long> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(long elem) {
    if (this.data == null) {
      this.data = new ArrayList<Long>();
    }
    this.data.add(elem);
  }

  public List<Long> getData() {
    return this.data;
  }

  public Command setData(List<Long> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMAND_TYPE:
      if (value == null) {
        unsetCommandType();
      } else {
        setCommandType((CommandType)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMAND_TYPE:
      return getCommandType();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMAND_TYPE:
      return isSetCommandType();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Command)
      return this.equals((Command)that);
    return false;
  }

  public boolean equals(Command that) {
    if (that == null)
      return false;

    boolean this_present_commandType = true && this.isSetCommandType();
    boolean that_present_commandType = true && that.isSetCommandType();
    if (this_present_commandType || that_present_commandType) {
      if (!(this_present_commandType && that_present_commandType))
        return false;
      if (!this.commandType.equals(that.commandType))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_commandType = true && (isSetCommandType());
    list.add(present_commandType);
    if (present_commandType)
      list.add(commandType.getValue());

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(Command other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommandType()).compareTo(other.isSetCommandType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommandType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commandType, other.commandType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Command(");
    boolean first = true;

    sb.append("commandType:");
    if (this.commandType == null) {
      sb.append("null");
    } else {
      sb.append(this.commandType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommandStandardSchemeFactory implements SchemeFactory {
    public CommandStandardScheme getScheme() {
      return new CommandStandardScheme();
    }
  }

  private static class CommandStandardScheme extends StandardScheme<Command> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Command struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMAND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.commandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
              struct.setCommandTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.data = new ArrayList<Long>(_list16.size);
                long _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readI64();
                  struct.data.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Command struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.commandType != null) {
        oprot.writeFieldBegin(COMMAND_TYPE_FIELD_DESC);
        oprot.writeI32(struct.commandType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.data.size()));
          for (long _iter19 : struct.data)
          {
            oprot.writeI64(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommandTupleSchemeFactory implements SchemeFactory {
    public CommandTupleScheme getScheme() {
      return new CommandTupleScheme();
    }
  }

  private static class CommandTupleScheme extends TupleScheme<Command> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCommandType()) {
        optionals.set(0);
      }
      if (struct.isSetData()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCommandType()) {
        oprot.writeI32(struct.commandType.getValue());
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (long _iter20 : struct.data)
          {
            oprot.writeI64(_iter20);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.commandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
        struct.setCommandTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.data = new ArrayList<Long>(_list21.size);
          long _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readI64();
            struct.data.add(_elem22);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

