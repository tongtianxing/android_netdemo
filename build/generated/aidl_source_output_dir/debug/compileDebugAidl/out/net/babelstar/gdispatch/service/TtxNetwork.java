/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\project\\mobile\\androidstudio\\ttxnetdemo\\trunck\\src\\net\\babelstar\\gdispatch\\service\\TtxNetwork.aidl
 */
package net.babelstar.gdispatch.service;
public interface TtxNetwork extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.babelstar.gdispatch.service.TtxNetwork
{
private static final java.lang.String DESCRIPTOR = "net.babelstar.gdispatch.service.TtxNetwork";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.babelstar.gdispatch.service.TtxNetwork interface,
 * generating a proxy if needed.
 */
public static net.babelstar.gdispatch.service.TtxNetwork asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.babelstar.gdispatch.service.TtxNetwork))) {
return ((net.babelstar.gdispatch.service.TtxNetwork)iin);
}
return new net.babelstar.gdispatch.service.TtxNetwork.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_setServerAndAccount:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setServerAndAccount(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setChnCount:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.setChnCount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setMediaInfo:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setMediaInfo(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setVideoEncode:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setVideoEncode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setGpsInterval:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.setGpsInterval(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setUsedCamera:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setUsedCamera(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setRecord:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setRecord(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isOnline:
{
data.enforceInterface(descriptor);
boolean _result = this.isOnline();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_IsVideoLiving:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.IsVideoLiving(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_IsTalkback:
{
data.enforceInterface(descriptor);
boolean _result = this.IsTalkback();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_IsAudioListen:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.IsAudioListen(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLastLongitude:
{
data.enforceInterface(descriptor);
double _result = this.getLastLongitude();
reply.writeNoException();
reply.writeDouble(_result);
return true;
}
case TRANSACTION_getLastLatitude:
{
data.enforceInterface(descriptor);
double _result = this.getLastLatitude();
reply.writeNoException();
reply.writeDouble(_result);
return true;
}
case TRANSACTION_AppCreateCamera:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.AppCreateCamera(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_AppReleaseCamera:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.AppReleaseCamera(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_initCameraPreview:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.initCameraPreview(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_freeCameraPreview:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.freeCameraPreview(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_uploadJpegFile:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.uploadJpegFile(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_storageRecord:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.storageRecord(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_SendAudioIntercom:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.SendAudioIntercom(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_AddAlarmInfo:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
int _arg9;
_arg9 = data.readInt();
int _arg10;
_arg10 = data.readInt();
java.lang.String _arg11;
_arg11 = data.readString();
int _result = this.AddAlarmInfo(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_UploadLastRecord:
{
data.enforceInterface(descriptor);
int _result = this.UploadLastRecord();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_inputYv12Buf:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _result = this.inputYv12Buf(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg1);
return true;
}
case TRANSACTION_inputYv12Data:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
byte[] _arg4;
_arg4 = data.createByteArray();
boolean _arg5;
_arg5 = (0!=data.readInt());
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
int _arg9;
_arg9 = data.readInt();
boolean _result = this.inputYv12Data(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeByteArray(_arg4);
return true;
}
case TRANSACTION_inputH264Data:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
boolean _result = this.inputH264Data(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeByteArray(_arg5);
return true;
}
case TRANSACTION_inputAacData:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.inputAacData(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeByteArray(_arg1);
return true;
}
case TRANSACTION_doChangeFrameRate:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.doChangeFrameRate(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_doChangeBitrate:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.doChangeBitrate(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_doChangeResolution:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.doChangeResolution(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_GetRecFileTimeInfo:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.GetRecFileTimeInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_uploadRecordFile:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.uploadRecordFile(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_SetAccStatus:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.SetAccStatus(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_SetRecordVideoStatus:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.SetRecordVideoStatus(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_GetAudioRecorderAmplitude:
{
data.enforceInterface(descriptor);
int _result = this.GetAudioRecorderAmplitude();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_StartRecordSound:
{
data.enforceInterface(descriptor);
this.StartRecordSound();
reply.writeNoException();
return true;
}
case TRANSACTION_StopRecordSound:
{
data.enforceInterface(descriptor);
this.StopRecordSound();
reply.writeNoException();
return true;
}
case TRANSACTION_storageRecordSound:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.storageRecordSound(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_UploadLastRecordSound:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _result = this.UploadLastRecordSound(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_PttRequireTalk:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.PttRequireTalk(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_PttRecordAudio:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _result = this.PttRecordAudio(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_PttInputAacFrame:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
int _result = this.PttInputAacFrame(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg0);
return true;
}
case TRANSACTION_StopWork:
{
data.enforceInterface(descriptor);
this.StopWork();
reply.writeNoException();
return true;
}
case TRANSACTION_IsNetWorkPosition:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.IsNetWorkPosition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getServerIp:
{
data.enforceInterface(descriptor);
java.lang.String _result = this.getServerIp();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getServerAccount:
{
data.enforceInterface(descriptor);
java.lang.String _result = this.getServerAccount();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_UpdateLocation:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
double _arg1;
_arg1 = data.readDouble();
double _arg2;
_arg2 = data.readDouble();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _result = this.UpdateLocation(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_IsAppPosition:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.IsAppPosition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_SetRecPathEx:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _arg3;
_arg3 = (0!=data.readInt());
int _result = this.SetRecPathEx(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_SetEchoParam:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
int _result = this.SetEchoParam(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_InputPcmData:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
int _result = this.InputPcmData(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg0);
return true;
}
case TRANSACTION_inputH265Data:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
boolean _result = this.inputH265Data(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeByteArray(_arg5);
return true;
}
case TRANSACTION_setMediaInfoEx:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.setMediaInfoEx(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements net.babelstar.gdispatch.service.TtxNetwork
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
//????????????ip????????? server?????????120.26.98.110???account?????????112233

@Override public void setServerAndAccount(java.lang.String server, java.lang.String account) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(server);
_data.writeString(account);
mRemote.transact(Stub.TRANSACTION_setServerAndAccount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????????????????????????????1

@Override public void setChnCount(int chnCount) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(chnCount);
mRemote.transact(Stub.TRANSACTION_setChnCount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????????????????
//audioType????????????   12=AAC_8KBPS	13=AAC_16KBPS  14=AAC_24KBPS

@Override public void setMediaInfo(int audioType, int param1, int param2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioType);
_data.writeInt(param1);
_data.writeInt(param2);
mRemote.transact(Stub.TRANSACTION_setMediaInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????????????????????????????????????????ture

@Override public void setVideoEncode(boolean encode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((encode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setVideoEncode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????GPS????????????????????????30

@Override public void setGpsInterval(int second) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(second);
mRemote.transact(Stub.TRANSACTION_setGpsInterval, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//???????????????????????????????????????true??????app????????????????????????yuv???????????????????????????????????????false??????app?????????????????????
//?????????true
//??????????????????????????????setUsedCamera(false)??????TTX???APP???????????????????????????????????????

@Override public void setUsedCamera(boolean used) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((used)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUsedCamera, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????????????????
//mainStreamRecord???????????????????????????false???
//subStreamRecord???????????????????????????true
//?????????????????????????????????????????????????????????mainStreamRecord?????????false???subStreamRecord????????????false??????TTX???APP???????????????????????????
//?????????????????????true

@Override public void setRecord(boolean mainStreamRecord, boolean subStreamRecord) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mainStreamRecord)?(1):(0)));
_data.writeInt(((subStreamRecord)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//????????????

@Override public boolean isOnline() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isOnline, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//?????????????????????
//channel?????????????????????0?????????0????????????1
//stream??????????????????0???????????????1????????????

@Override public boolean IsVideoLiving(int channel, int stream) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
mRemote.transact(Stub.TRANSACTION_IsVideoLiving, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????????????????

@Override public boolean IsTalkback() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_IsTalkback, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//?????????????????? 

@Override public boolean IsAudioListen(int channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
mRemote.transact(Stub.TRANSACTION_IsAudioListen, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????????????????????????????

@Override public double getLastLongitude() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
double _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastLongitude, _data, _reply, 0);
_reply.readException();
_result = _reply.readDouble();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public double getLastLatitude() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
double _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastLatitude, _data, _reply, 0);
_reply.readException();
_result = _reply.readDouble();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//????????????????????????????????????????????????????????????service

@Override public void AppCreateCamera(int channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
mRemote.transact(Stub.TRANSACTION_AppCreateCamera, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//????????????????????????????????????????????????????????????service

@Override public void AppReleaseCamera(int channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
mRemote.transact(Stub.TRANSACTION_AppReleaseCamera, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//????????????yuv?????????????????????????????????????????????????????????

@Override public void initCameraPreview(int channel, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_initCameraPreview, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//???????????????????????????????????????????????????????????????

@Override public void freeCameraPreview(int channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
mRemote.transact(Stub.TRANSACTION_freeCameraPreview, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int uploadJpegFile(int channel, java.lang.String fileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeString(fileName);
mRemote.transact(Stub.TRANSACTION_uploadJpegFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int storageRecord(int channel, boolean save) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(((save)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_storageRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int SendAudioIntercom(boolean start) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((start)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_SendAudioIntercom, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int AddAlarmInfo(int nAlarmType, int nAlarmInfo, int nParam1, int nParam2, int nParam3, int nParam4, int nParam5, int nParam6, int nParam7, int nParam8, int nParam9, java.lang.String desc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nAlarmType);
_data.writeInt(nAlarmInfo);
_data.writeInt(nParam1);
_data.writeInt(nParam2);
_data.writeInt(nParam3);
_data.writeInt(nParam4);
_data.writeInt(nParam5);
_data.writeInt(nParam6);
_data.writeInt(nParam7);
_data.writeInt(nParam8);
_data.writeInt(nParam9);
_data.writeString(desc);
mRemote.transact(Stub.TRANSACTION_AddAlarmInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int UploadLastRecord() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_UploadLastRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int inputYv12Buf(int channel, byte[] yv12, boolean isYv12, int width, int heigth, int length) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeByteArray(yv12);
_data.writeInt(((isYv12)?(1):(0)));
_data.writeInt(width);
_data.writeInt(heigth);
_data.writeInt(length);
mRemote.transact(Stub.TRANSACTION_inputYv12Buf, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(yv12);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//aidl????????????byte[]????????????????????????????????????1M?????????????????????1M????????????????????????
//??????yuv??????
//channel?????????????????????0?????????0?????????1
//index?????????????????????yuv??????????????????????????????yuv???????????? 512000?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  512000???????????????
//offset?????????yuv??????????????????
//length????????????yuv??????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????

@Override public boolean inputYv12Data(int channel, int index, int packIndex, int packCount, byte[] yv12, boolean isYv12, int offset, int packLength, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(index);
_data.writeInt(packIndex);
_data.writeInt(packCount);
_data.writeByteArray(yv12);
_data.writeInt(((isYv12)?(1):(0)));
_data.writeInt(offset);
_data.writeInt(packLength);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_inputYv12Data, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readByteArray(yv12);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????nalu??????
//h264????????????	http://www.jianshu.com/p/d28e25ae339e
//channel?????????????????????0?????????0?????????1
//stream???0????????????1?????????
//index?????????????????????nalu??????????????????????????????nalu????????????  1024000 ?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  1024000 ???????????????
//offset?????????nalu??????????????????
//length??????nalu?????????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????
//System.arraycopy(nalu, 0, mNaluBuffer, offset, packLength);

@Override public boolean inputH264Data(int channel, int stream, int index, int packIndex, int packCount, byte[] nalu, int offset, int packLength, int naluLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
_data.writeInt(index);
_data.writeInt(packIndex);
_data.writeInt(packCount);
_data.writeByteArray(nalu);
_data.writeInt(offset);
_data.writeInt(packLength);
_data.writeInt(naluLength);
mRemote.transact(Stub.TRANSACTION_inputH264Data, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readByteArray(nalu);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//?????????aac??????????????????adts?????????
//???????????????adts???????????????aac???????????????????????????vlc????????????????????????

@Override public boolean inputAacData(int channel, byte[] aac, int length) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeByteArray(aac);
_data.writeInt(length);
mRemote.transact(Stub.TRANSACTION_inputAacData, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readByteArray(aac);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????????????????????????????????????????  stream???0????????????1?????????

@Override public void doChangeFrameRate(int channel, int stream, int frameRate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
_data.writeInt(frameRate);
mRemote.transact(Stub.TRANSACTION_doChangeFrameRate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void doChangeBitrate(int channel, int stream, int bitrate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
_data.writeInt(bitrate);
mRemote.transact(Stub.TRANSACTION_doChangeBitrate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void doChangeResolution(int channel, int stream, int resolution) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
_data.writeInt(resolution);
mRemote.transact(Stub.TRANSACTION_doChangeResolution, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String GetRecFileTimeInfo(java.lang.String file) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(file);
mRemote.transact(Stub.TRANSACTION_GetRecFileTimeInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int uploadRecordFile(int channel, java.lang.String fileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeString(fileName);
mRemote.transact(Stub.TRANSACTION_uploadRecordFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????acc??????

@Override public void SetAccStatus(boolean accStatus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((accStatus)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_SetAccStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//??????????????????????????????????????? 
//nVideoRecord: ???0???????????????1,  ??????1??????????????????
//nVideoStatus: ???0???????????????1,  ??????1??????????????????

@Override public void SetRecordVideoStatus(int nRecordStatus, int nVideoStatus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nRecordStatus);
_data.writeInt(nVideoStatus);
mRemote.transact(Stub.TRANSACTION_SetRecordVideoStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int GetAudioRecorderAmplitude() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_GetAudioRecorderAmplitude, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//????????????????????????

@Override public void StartRecordSound() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_StartRecordSound, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//????????????????????????

@Override public void StopRecordSound() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_StopRecordSound, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int storageRecordSound(int channel, boolean save) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(((save)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_storageRecordSound, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int UploadLastRecordSound(long second) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(second);
mRemote.transact(Stub.TRANSACTION_UploadLastRecordSound, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int PttRequireTalk(int bTalk) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bTalk);
mRemote.transact(Stub.TRANSACTION_PttRequireTalk, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int PttRecordAudio(int bRecord, boolean bCancel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(bRecord);
_data.writeInt(((bCancel)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_PttRecordAudio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int PttInputAacFrame(byte[] pAac, int nLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(pAac);
_data.writeInt(nLength);
mRemote.transact(Stub.TRANSACTION_PttInputAacFrame, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(pAac);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void StopWork() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_StopWork, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//????????????????????????

@Override public void IsNetWorkPosition(boolean isNetWorkPosition) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isNetWorkPosition)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_IsNetWorkPosition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getServerIp() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServerIp, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getServerAccount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServerAccount, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int UpdateLocation(int nValid, double longtitude, double latitude, int nCoorType, int nLocType, int nSpeed, int nDirection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nValid);
_data.writeDouble(longtitude);
_data.writeDouble(latitude);
_data.writeInt(nCoorType);
_data.writeInt(nLocType);
_data.writeInt(nSpeed);
_data.writeInt(nDirection);
mRemote.transact(Stub.TRANSACTION_UpdateLocation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//????????????app??????

@Override public void IsAppPosition(boolean isAppPosition) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isAppPosition)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_IsAppPosition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int SetRecPathEx(java.lang.String recPath, java.lang.String jpgPath, java.lang.String sdLogPath, boolean bIsSetRecPath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(recPath);
_data.writeString(jpgPath);
_data.writeString(sdLogPath);
_data.writeInt(((bIsSetRecPath)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_SetRecPathEx, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int SetEchoParam(boolean bIsOpenEcho, int nDelay) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((bIsOpenEcho)?(1):(0)));
_data.writeInt(nDelay);
mRemote.transact(Stub.TRANSACTION_SetEchoParam, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int InputPcmData(byte[] pWavBuf, int nWavLen) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(pWavBuf);
_data.writeInt(nWavLen);
mRemote.transact(Stub.TRANSACTION_InputPcmData, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(pWavBuf);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//??????nalu?????? 265
//h264????????????	http://www.jianshu.com/p/d28e25ae339e
//channel?????????????????????0?????????0?????????1
//stream???0????????????1?????????
//index?????????????????????nalu??????????????????????????????nalu????????????  1024000 ?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  1024000 ???????????????
//offset?????????nalu??????????????????
//length??????nalu?????????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????
//System.arraycopy(nalu, 0, mNaluBuffer, offset, packLength);

@Override public boolean inputH265Data(int channel, int stream, int index, int packIndex, int packCount, byte[] nalu, int offset, int packLength, int naluLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(stream);
_data.writeInt(index);
_data.writeInt(packIndex);
_data.writeInt(packCount);
_data.writeByteArray(nalu);
_data.writeInt(offset);
_data.writeInt(packLength);
_data.writeInt(naluLength);
mRemote.transact(Stub.TRANSACTION_inputH265Data, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readByteArray(nalu);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//audioType????????????   12=AAC_8KBPS	13=AAC_16KBPS  14=AAC_24KBPS
//videoType????????????   0 = TTX_VIDEO_CODEC_H264  4 = TTX_VIDEO_CODEC_H265

@Override public void setMediaInfoEx(int audioType, int param1, int param2, int videoType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(audioType);
_data.writeInt(param1);
_data.writeInt(param2);
_data.writeInt(videoType);
mRemote.transact(Stub.TRANSACTION_setMediaInfoEx, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setServerAndAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setChnCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setMediaInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setVideoEncode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setGpsInterval = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setUsedCamera = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isOnline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_IsVideoLiving = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_IsTalkback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_IsAudioListen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getLastLongitude = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getLastLatitude = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_AppCreateCamera = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_AppReleaseCamera = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_initCameraPreview = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_freeCameraPreview = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_uploadJpegFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_storageRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_SendAudioIntercom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_AddAlarmInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_UploadLastRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_inputYv12Buf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_inputYv12Data = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_inputH264Data = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_inputAacData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_doChangeFrameRate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_doChangeBitrate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_doChangeResolution = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_GetRecFileTimeInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_uploadRecordFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_SetAccStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_SetRecordVideoStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_GetAudioRecorderAmplitude = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_StartRecordSound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_StopRecordSound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_storageRecordSound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_UploadLastRecordSound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_PttRequireTalk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_PttRecordAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_PttInputAacFrame = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_StopWork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_IsNetWorkPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getServerIp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getServerAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_UpdateLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_IsAppPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_SetRecPathEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_SetEchoParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_InputPcmData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_inputH265Data = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_setMediaInfoEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
}
//????????????ip????????? server?????????120.26.98.110???account?????????112233

public void setServerAndAccount(java.lang.String server, java.lang.String account) throws android.os.RemoteException;
//??????????????????????????????1

public void setChnCount(int chnCount) throws android.os.RemoteException;
//??????????????????
//audioType????????????   12=AAC_8KBPS	13=AAC_16KBPS  14=AAC_24KBPS

public void setMediaInfo(int audioType, int param1, int param2) throws android.os.RemoteException;
//??????????????????????????????????????????ture

public void setVideoEncode(boolean encode) throws android.os.RemoteException;
//??????GPS????????????????????????30

public void setGpsInterval(int second) throws android.os.RemoteException;
//???????????????????????????????????????true??????app????????????????????????yuv???????????????????????????????????????false??????app?????????????????????
//?????????true
//??????????????????????????????setUsedCamera(false)??????TTX???APP???????????????????????????????????????

public void setUsedCamera(boolean used) throws android.os.RemoteException;
//??????????????????
//mainStreamRecord???????????????????????????false???
//subStreamRecord???????????????????????????true
//?????????????????????????????????????????????????????????mainStreamRecord?????????false???subStreamRecord????????????false??????TTX???APP???????????????????????????
//?????????????????????true

public void setRecord(boolean mainStreamRecord, boolean subStreamRecord) throws android.os.RemoteException;
//????????????

public boolean isOnline() throws android.os.RemoteException;
//?????????????????????
//channel?????????????????????0?????????0????????????1
//stream??????????????????0???????????????1????????????

public boolean IsVideoLiving(int channel, int stream) throws android.os.RemoteException;
//??????????????????

public boolean IsTalkback() throws android.os.RemoteException;
//?????????????????? 

public boolean IsAudioListen(int channel) throws android.os.RemoteException;
//??????????????????????????????

public double getLastLongitude() throws android.os.RemoteException;
public double getLastLatitude() throws android.os.RemoteException;
//????????????????????????????????????????????????????????????service

public void AppCreateCamera(int channel) throws android.os.RemoteException;
//????????????????????????????????????????????????????????????service

public void AppReleaseCamera(int channel) throws android.os.RemoteException;
//????????????yuv?????????????????????????????????????????????????????????

public void initCameraPreview(int channel, int width, int height) throws android.os.RemoteException;
//???????????????????????????????????????????????????????????????

public void freeCameraPreview(int channel) throws android.os.RemoteException;
public int uploadJpegFile(int channel, java.lang.String fileName) throws android.os.RemoteException;
public int storageRecord(int channel, boolean save) throws android.os.RemoteException;
public int SendAudioIntercom(boolean start) throws android.os.RemoteException;
public int AddAlarmInfo(int nAlarmType, int nAlarmInfo, int nParam1, int nParam2, int nParam3, int nParam4, int nParam5, int nParam6, int nParam7, int nParam8, int nParam9, java.lang.String desc) throws android.os.RemoteException;
public int UploadLastRecord() throws android.os.RemoteException;
public int inputYv12Buf(int channel, byte[] yv12, boolean isYv12, int width, int heigth, int length) throws android.os.RemoteException;
//aidl????????????byte[]????????????????????????????????????1M?????????????????????1M????????????????????????
//??????yuv??????
//channel?????????????????????0?????????0?????????1
//index?????????????????????yuv??????????????????????????????yuv???????????? 512000?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  512000???????????????
//offset?????????yuv??????????????????
//length????????????yuv??????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????

public boolean inputYv12Data(int channel, int index, int packIndex, int packCount, byte[] yv12, boolean isYv12, int offset, int packLength, int width, int height) throws android.os.RemoteException;
//??????nalu??????
//h264????????????	http://www.jianshu.com/p/d28e25ae339e
//channel?????????????????????0?????????0?????????1
//stream???0????????????1?????????
//index?????????????????????nalu??????????????????????????????nalu????????????  1024000 ?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  1024000 ???????????????
//offset?????????nalu??????????????????
//length??????nalu?????????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????
//System.arraycopy(nalu, 0, mNaluBuffer, offset, packLength);

public boolean inputH264Data(int channel, int stream, int index, int packIndex, int packCount, byte[] nalu, int offset, int packLength, int naluLength) throws android.os.RemoteException;
//?????????aac??????????????????adts?????????
//???????????????adts???????????????aac???????????????????????????vlc????????????????????????

public boolean inputAacData(int channel, byte[] aac, int length) throws android.os.RemoteException;
//??????????????????????????????????????????  stream???0????????????1?????????

public void doChangeFrameRate(int channel, int stream, int frameRate) throws android.os.RemoteException;
public void doChangeBitrate(int channel, int stream, int bitrate) throws android.os.RemoteException;
public void doChangeResolution(int channel, int stream, int resolution) throws android.os.RemoteException;
public java.lang.String GetRecFileTimeInfo(java.lang.String file) throws android.os.RemoteException;
public int uploadRecordFile(int channel, java.lang.String fileName) throws android.os.RemoteException;
//??????acc??????

public void SetAccStatus(boolean accStatus) throws android.os.RemoteException;
//??????????????????????????????????????? 
//nVideoRecord: ???0???????????????1,  ??????1??????????????????
//nVideoStatus: ???0???????????????1,  ??????1??????????????????

public void SetRecordVideoStatus(int nRecordStatus, int nVideoStatus) throws android.os.RemoteException;
public int GetAudioRecorderAmplitude() throws android.os.RemoteException;
//????????????????????????

public void StartRecordSound() throws android.os.RemoteException;
//????????????????????????

public void StopRecordSound() throws android.os.RemoteException;
public int storageRecordSound(int channel, boolean save) throws android.os.RemoteException;
public int UploadLastRecordSound(long second) throws android.os.RemoteException;
public int PttRequireTalk(int bTalk) throws android.os.RemoteException;
public int PttRecordAudio(int bRecord, boolean bCancel) throws android.os.RemoteException;
public int PttInputAacFrame(byte[] pAac, int nLength) throws android.os.RemoteException;
public void StopWork() throws android.os.RemoteException;
//????????????????????????

public void IsNetWorkPosition(boolean isNetWorkPosition) throws android.os.RemoteException;
public java.lang.String getServerIp() throws android.os.RemoteException;
public java.lang.String getServerAccount() throws android.os.RemoteException;
public int UpdateLocation(int nValid, double longtitude, double latitude, int nCoorType, int nLocType, int nSpeed, int nDirection) throws android.os.RemoteException;
//????????????app??????

public void IsAppPosition(boolean isAppPosition) throws android.os.RemoteException;
public int SetRecPathEx(java.lang.String recPath, java.lang.String jpgPath, java.lang.String sdLogPath, boolean bIsSetRecPath) throws android.os.RemoteException;
public int SetEchoParam(boolean bIsOpenEcho, int nDelay) throws android.os.RemoteException;
public int InputPcmData(byte[] pWavBuf, int nWavLen) throws android.os.RemoteException;
//??????nalu?????? 265
//h264????????????	http://www.jianshu.com/p/d28e25ae339e
//channel?????????????????????0?????????0?????????1
//stream???0????????????1?????????
//index?????????????????????nalu??????????????????????????????nalu????????????  1024000 ?????????????????????????????????????????????
//(packIndex + 1) = packCount ????????????????????????????????????  1024000 ???????????????
//offset?????????nalu??????????????????
//length??????nalu?????????????????????
//???????????????   System.arraycopy(yv12, 0, dest, offset, packLength);
//dest???????????????offset???????????????????????????????????????
//System.arraycopy(nalu, 0, mNaluBuffer, offset, packLength);

public boolean inputH265Data(int channel, int stream, int index, int packIndex, int packCount, byte[] nalu, int offset, int packLength, int naluLength) throws android.os.RemoteException;
//audioType????????????   12=AAC_8KBPS	13=AAC_16KBPS  14=AAC_24KBPS
//videoType????????????   0 = TTX_VIDEO_CODEC_H264  4 = TTX_VIDEO_CODEC_H265

public void setMediaInfoEx(int audioType, int param1, int param2, int videoType) throws android.os.RemoteException;
}
