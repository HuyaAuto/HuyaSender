package com.skytalking.huya;

/* EWSCmd_NULL: 0,
 * EWSCmd_RegisterReq: 1,
 * EWSCmd_RegisterRsp: 2,
 * EWSCmd_WupReq: 3,
 * EWSCmd_WupRsp: 4,
 * EWSCmdC2S_HeartBeat: 5,
 * EWSCmdS2C_HeartBeatAck: 6,
 * EWSCmdS2C_MsgPushReq: 7,
 * EWSCmdC2S_DeregisterReq: 8,
 * EWSCmdS2C_DeRegisterRsp: 9,
 * EWSCmdC2S_VerifyCookieReq: 10,
 * EWSCmdS2C_VerifyCookieRsp: 11,
 * EWSCmdC2S_VerifyHuyaTokenReq: 12,
 * EWSCmdS2C_VerifyHuyaTokenRsp: 13,
 * EWSCmdC2S_UNVerifyReq: 14,
 * EWSCmdS2C_UNVerifyRsp: 15,
 * EWSCmdC2S_RegisterGroupReq: 16,
 * EWSCmdS2C_RegisterGroupRsp: 17,
 * EWSCmdC2S_UnRegisterGroupReq: 18,
 * EWSCmdS2C_UnRegisterGroupRsp: 19,
 * EWSCmdC2S_HeartBeatReq: 20,
 * EWSCmdS2C_HeartBeatRsp: 21,
 * EWSCmdS2C_MsgPushReq_V2: 22,
 * EWSCmdC2S_UpdateUserExpsReq: 23,
 * EWSCmdS2C_UpdateUserExpsRsp: 24,
 * EWSCmdC2S_WSHistoryMsgReq: 25,
 * EWSCmdS2C_WSHistoryMsgRsp: 26,
 * EWSCmdS2C_EnterP2P: 27,
 * EWSCmdS2C_EnterP2PAck: 28,
 * EWSCmdS2C_ExitP2P: 29,
 * EWSCmdS2C_ExitP2PAck: 30
 */
public interface EWebSocketCommandType {
    int EWSCmd_NULL = 0;
    int EWSCmd_RegisterReq = 1;
    int EWSCmd_RegisterRsp = 2;
    int EWSCmd_WupReq = 3;
    int EWSCmd_WupRsp = 4;
    int EWSCmdC2S_HeartBeat = 5;
    int EWSCmdS2C_HeartBeatAck = 6;
    int EWSCmdS2C_MsgPushReq = 7;
    int EWSCmdC2S_DeregisterReq = 8;
    int EWSCmdS2C_DeRegisterRsp = 9;
    int EWSCmdC2S_VerifyCookieReq = 10;
    int EWSCmdS2C_VerifyCookieRsp = 11;
    int EWSCmdC2S_VerifyHuyaTokenReq = 12;
    int EWSCmdS2C_VerifyHuyaTokenRsp = 13;
    int EWSCmdC2S_UNVerifyReq = 14;
    int EWSCmdS2C_UNVerifyRsp = 15;
    int EWSCmdC2S_RegisterGroupReq = 16;
    int EWSCmdS2C_RegisterGroupRsp = 17;
    int EWSCmdC2S_UnRegisterGroupReq = 18;
    int EWSCmdS2C_UnRegisterGroupRsp = 19;
    int EWSCmdC2S_HeartBeatReq = 20;
    int EWSCmdS2C_HeartBeatRsp = 21;
    int EWSCmdS2C_MsgPushReq_V2 = 22;
    int EWSCmdC2S_UpdateUserExpsReq = 23;
    int EWSCmdS2C_UpdateUserExpsRsp = 24;
    int EWSCmdC2S_WSHistoryMsgReq = 25;
    int EWSCmdS2C_WSHistoryMsgRsp = 26;
    int EWSCmdS2C_EnterP2P = 27;
    int EWSCmdS2C_EnterP2PAck = 28;
    int EWSCmdS2C_ExitP2P = 29;
    int EWSCmdS2C_ExitP2PAck = 30;
}
