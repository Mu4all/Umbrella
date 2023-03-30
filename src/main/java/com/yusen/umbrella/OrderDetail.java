package com.yusen.umbrella;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderDetail implements java.io.Serializable {
	static final long serialVersionUID = 1L;
	
	@org.kie.api.definition.type.Label("INTERFACE_RECORD_ID")
private java.lang.String INTERFACE_RECORD_ID;

@org.kie.api.definition.type.Label("STATUS_FLOW_NAME")
private java.lang.String STATUS_FLOW_NAME;

@org.kie.api.definition.type.Label("warehouse")
private java.lang.String warehouse;

@org.kie.api.definition.type.Label("COMPANY")
private java.lang.String COMPANY;

@org.kie.api.definition.type.Label("ALLOCATION_RULE")
private java.lang.String ALLOCATION_RULE;

@org.kie.api.definition.type.Label("INTERFACE_LINK_ID")
private java.lang.String INTERFACE_LINK_ID;

@org.kie.api.definition.type.Label("INTERFACE_ACTION_CODE")
private java.lang.String INTERFACE_ACTION_CODE;

@org.kie.api.definition.type.Label("INTERFACE_CONDITION")
private java.lang.String INTERFACE_CONDITION;

@org.kie.api.definition.type.Label("INTERFACE_ERROR")
private java.lang.String INTERFACE_ERROR;

@org.kie.api.definition.type.Label("CATALOG_ID")
private java.lang.String CATALOG_ID;

@org.kie.api.definition.type.Label("CATCH_WEIGHT_REQD")
private java.lang.String CATCH_WEIGHT_REQD;

@org.kie.api.definition.type.Label("CUSTOMER_PO")
private java.lang.String CUSTOMER_PO;

@org.kie.api.definition.type.Label("ERP_ORDER")
private java.lang.String ERP_ORDER;

@org.kie.api.definition.type.Label("ERP_ORDER_LINE_NUM")
private java.lang.String ERP_ORDER_LINE_NUM;

@org.kie.api.definition.type.Label("HAZARDOUS_CODE")
private java.lang.String HAZARDOUS_CODE;

@org.kie.api.definition.type.Label("INITIAL_QTY")
private java.lang.String INITIAL_QTY;

@org.kie.api.definition.type.Label("INITIAL_VALUE")
private java.lang.String INITIAL_VALUE;

@org.kie.api.definition.type.Label("INITIAL_VOLUME")
private java.lang.String INITIAL_VOLUME;

@org.kie.api.definition.type.Label("INITIAL_WEIGHT")
private java.lang.String INITIAL_WEIGHT;

@org.kie.api.definition.type.Label("INVOICE")
private java.lang.String INVOICE;

@org.kie.api.definition.type.Label("ITEM")
private java.lang.String ITEM;

@org.kie.api.definition.type.Label("ITEM_CLASS")
private java.lang.String ITEM_CLASS;

@org.kie.api.definition.type.Label("ITEM_COLOR")
private java.lang.String ITEM_COLOR;

@org.kie.api.definition.type.Label("ITEM_DEPARTMENT")
private java.lang.String ITEM_DEPARTMENT;

@org.kie.api.definition.type.Label("ITEM_DESC")
private java.lang.String ITEM_DESC;

@org.kie.api.definition.type.Label("ITEM_DIMENSION_UM")
private java.lang.String ITEM_DIMENSION_UM;

@org.kie.api.definition.type.Label("ITEM_DIVISION")
private java.lang.String ITEM_DIVISION;

@org.kie.api.definition.type.Label("ITEM_LIST_PRICE")
private java.lang.String ITEM_LIST_PRICE;

@org.kie.api.definition.type.Label("ITEM_NET_PRICE")
private java.lang.String ITEM_NET_PRICE;

@org.kie.api.definition.type.Label("ITEM_SIZE")
private java.lang.String ITEM_SIZE;

@org.kie.api.definition.type.Label("ITEM_STYLE")
private java.lang.String ITEM_STYLE;

@org.kie.api.definition.type.Label("LOT")
private java.lang.String LOT;

@org.kie.api.definition.type.Label("LOT_CONTROLLED")
private java.lang.String LOT_CONTROLLED;

@org.kie.api.definition.type.Label("MANUFACTURER_ID")
private java.lang.String MANUFACTURER_ID;

@org.kie.api.definition.type.Label("MARK_FOR")
private java.lang.String MARK_FOR;

@org.kie.api.definition.type.Label("MARK_FOR_ADDRESS1")
private java.lang.String MARK_FOR_ADDRESS1;

@org.kie.api.definition.type.Label("MARK_FOR_ADDRESS2")
private java.lang.String MARK_FOR_ADDRESS2;

@org.kie.api.definition.type.Label("MARK_FOR_ADDRESS3")
private java.lang.String MARK_FOR_ADDRESS3;

@org.kie.api.definition.type.Label("MARK_FOR_ATTENTION_TO")
private java.lang.String MARK_FOR_ATTENTION_TO;

@org.kie.api.definition.type.Label("MARK_FOR_CITY")
private java.lang.String MARK_FOR_CITY;

@org.kie.api.definition.type.Label("MARK_FOR_COUNTRY")
private java.lang.String MARK_FOR_COUNTRY;

@org.kie.api.definition.type.Label("MARK_FOR_EMAIL_ADDRESS")
private java.lang.String MARK_FOR_EMAIL_ADDRESS;

@org.kie.api.definition.type.Label("MARK_FOR_FAX_NUM")
private java.lang.String MARK_FOR_FAX_NUM;

@org.kie.api.definition.type.Label("MARK_FOR_NAME")
private java.lang.String MARK_FOR_NAME;

@org.kie.api.definition.type.Label("MARK_FOR_PHONE_NUM")
private java.lang.String MARK_FOR_PHONE_NUM;

@org.kie.api.definition.type.Label("MARK_FOR_POSTAL_CODE")
private java.lang.String MARK_FOR_POSTAL_CODE;

@org.kie.api.definition.type.Label("MARK_FOR_STATE")
private java.lang.String MARK_FOR_STATE;

@org.kie.api.definition.type.Label("MERCHANDISE_CODE")
private java.lang.String MERCHANDISE_CODE;

@org.kie.api.definition.type.Label("NMFC_CODE")
private java.lang.String NMFC_CODE;

@org.kie.api.definition.type.Label("OPEN_QTY")
private java.lang.String OPEN_QTY;

@org.kie.api.definition.type.Label("ORDER_DATE")
private java.lang.String ORDER_DATE;

@org.kie.api.definition.type.Label("ORDER_PRIORITY")
private java.lang.String ORDER_PRIORITY;

@org.kie.api.definition.type.Label("ORIGINAL_ITEM_ORDERED")
private java.lang.String ORIGINAL_ITEM_ORDERED;

@org.kie.api.definition.type.Label("PACKING_CATEGORY")
private java.lang.String PACKING_CATEGORY;

@org.kie.api.definition.type.Label("PICK_LIST_ID")
private java.lang.String PICK_LIST_ID;

@org.kie.api.definition.type.Label("PICK_LOC")
private java.lang.String PICK_LOC;

@org.kie.api.definition.type.Label("PICK_ZONE")
private java.lang.String PICK_ZONE;

@org.kie.api.definition.type.Label("PLANNED_SHIP_DATE")
private java.lang.String PLANNED_SHIP_DATE;

@org.kie.api.definition.type.Label("PRIORITY")
private java.lang.String PRIORITY;

@org.kie.api.definition.type.Label("QUANTITY_UM")
private java.lang.String QUANTITY_UM;

@org.kie.api.definition.type.Label("REQUESTED_DELIVERY_DATE")
private java.lang.String REQUESTED_DELIVERY_DATE;

@org.kie.api.definition.type.Label("REQUESTED_DELIVERY_TYPE")
private java.lang.String REQUESTED_DELIVERY_TYPE;

@org.kie.api.definition.type.Label("REQUESTED_QTY")
private java.lang.String REQUESTED_QTY;

@org.kie.api.definition.type.Label("SECONDARY_PICK_LOC")
private java.lang.String SECONDARY_PICK_LOC;

@org.kie.api.definition.type.Label("SECONDARY_PICK_ZONE")
private java.lang.String SECONDARY_PICK_ZONE;

@org.kie.api.definition.type.Label("SERIAL_NUM_REQD")
private java.lang.String SERIAL_NUM_REQD;

@org.kie.api.definition.type.Label("SHIPMENT_ID")
private java.lang.String SHIPMENT_ID;

@org.kie.api.definition.type.Label("SHIPPED_QTY")
private java.lang.String SHIPPED_QTY;

@org.kie.api.definition.type.Label("TOTAL_QTY")
private java.lang.String TOTAL_QTY;

@org.kie.api.definition.type.Label("VALUE_ADD_LABEL_CODE")
private java.lang.String VALUE_ADD_LABEL_CODE;

@org.kie.api.definition.type.Label("VOLUME_UM")
private java.lang.String VOLUME_UM;

@org.kie.api.definition.type.Label("WEIGHT_UM")
private java.lang.String WEIGHT_UM;

@org.kie.api.definition.type.Label("USER_DEF1")
private java.lang.String USER_DEF1;

@org.kie.api.definition.type.Label("USER_DEF2")
private java.lang.String USER_DEF2;

@org.kie.api.definition.type.Label("USER_DEF3")
private java.lang.String USER_DEF3;

@org.kie.api.definition.type.Label("USER_DEF4")
private java.lang.String USER_DEF4;

@org.kie.api.definition.type.Label("USER_DEF5")
private java.lang.String USER_DEF5;

@org.kie.api.definition.type.Label("USER_DEF6")
private java.lang.String USER_DEF6;

@org.kie.api.definition.type.Label("USER_DEF7")
private java.lang.String USER_DEF7;

@org.kie.api.definition.type.Label("USER_DEF8")
private java.lang.String USER_DEF8;

@org.kie.api.definition.type.Label("USER_STAMP")
private java.lang.String USER_STAMP;

@org.kie.api.definition.type.Label("PROCESS_STAMP")
private java.lang.String PROCESS_STAMP;

@org.kie.api.definition.type.Label("DATE_TIME_STAMP")
private java.lang.String DATE_TIME_STAMP;

@org.kie.api.definition.type.Label("TMP_INTERNAL_ORDER_NUM")
private java.lang.String TMP_INTERNAL_ORDER_NUM;

@org.kie.api.definition.type.Label("TMP_INTERNAL_SHIPMENT_NUM")
private java.lang.String TMP_INTERNAL_SHIPMENT_NUM;

@org.kie.api.definition.type.Label("TMP_INTERNAL_SHIPMENT_LINE_NUM")
private java.lang.String TMP_INTERNAL_SHIPMENT_LINE_NUM;

@org.kie.api.definition.type.Label("HARMONIZED_CODE")
private java.lang.String HARMONIZED_CODE;

@org.kie.api.definition.type.Label("HARMONIZED_DESC")
private java.lang.String HARMONIZED_DESC;

@org.kie.api.definition.type.Label("EXPORT_DESC")
private java.lang.String EXPORT_DESC;

@org.kie.api.definition.type.Label("PREFERENCE_CRIT")
private java.lang.String PREFERENCE_CRIT;

@org.kie.api.definition.type.Label("NET_COST")
private java.lang.String NET_COST;

@org.kie.api.definition.type.Label("COUNTRY_OF_ORIGIN")
private java.lang.String COUNTRY_OF_ORIGIN;

@org.kie.api.definition.type.Label("PRODUCER")
private java.lang.String PRODUCER;

@org.kie.api.definition.type.Label("CUSTOMER_ITEM")
private java.lang.String CUSTOMER_ITEM;

@org.kie.api.definition.type.Label("TMP_INTERNAL_ORDER_DTL_NUM")
private java.lang.String TMP_INTERNAL_ORDER_DTL_NUM;

@org.kie.api.definition.type.Label("ITEM_CATEGORY1")
private java.lang.String ITEM_CATEGORY1;

@org.kie.api.definition.type.Label("ITEM_CATEGORY2")
private java.lang.String ITEM_CATEGORY2;

@org.kie.api.definition.type.Label("ITEM_CATEGORY3")
private java.lang.String ITEM_CATEGORY3;

@org.kie.api.definition.type.Label("ITEM_CATEGORY4")
private java.lang.String ITEM_CATEGORY4;

@org.kie.api.definition.type.Label("ITEM_CATEGORY5")
private java.lang.String ITEM_CATEGORY5;

@org.kie.api.definition.type.Label("ITEM_CATEGORY6")
private java.lang.String ITEM_CATEGORY6;

@org.kie.api.definition.type.Label("ITEM_CATEGORY7")
private java.lang.String ITEM_CATEGORY7;

@org.kie.api.definition.type.Label("ITEM_CATEGORY8")
private java.lang.String ITEM_CATEGORY8;

@org.kie.api.definition.type.Label("ITEM_CATEGORY9")
private java.lang.String ITEM_CATEGORY9;

@org.kie.api.definition.type.Label("ITEM_CATEGORY10")
private java.lang.String ITEM_CATEGORY10;

@org.kie.api.definition.type.Label("CONT_CREATION_FULL_QTY")
private java.lang.String CONT_CREATION_FULL_QTY;

@org.kie.api.definition.type.Label("CONT_CREATION_FULL_QTY_UM")
private java.lang.String CONT_CREATION_FULL_QTY_UM;

@org.kie.api.definition.type.Label("CONT_CREATION_INNERPACK_QTY")
private java.lang.String CONT_CREATION_INNERPACK_QTY;

@org.kie.api.definition.type.Label("PACKING_CLASS")
private java.lang.String PACKING_CLASS;

@org.kie.api.definition.type.Label("ALLOCATE_FULL_LOC_QTY")
private java.lang.String ALLOCATE_FULL_LOC_QTY;

@org.kie.api.definition.type.Label("ALLOW_PCT_ALLOC")
private java.lang.String ALLOW_PCT_ALLOC;

@org.kie.api.definition.type.Label("MINIMUM_ALLOC_PCT")
private java.lang.String MINIMUM_ALLOC_PCT;

@org.kie.api.definition.type.Label("MAXIMUM_ALLOC_PCT")
private java.lang.String MAXIMUM_ALLOC_PCT;

@org.kie.api.definition.type.Label("IMMEDIATE_NEEDS_NOTE")
private java.lang.String IMMEDIATE_NEEDS_NOTE;

@org.kie.api.definition.type.Label("VALUE")
private java.lang.String VALUE;

@org.kie.api.definition.type.Label("TREAT_AS_LOOSE")
private java.lang.String TREAT_AS_LOOSE;

@org.kie.api.definition.type.Label("BOM_ACTION")
private java.lang.String BOM_ACTION;

@org.kie.api.definition.type.Label("QUANTITY_NEEDED_PER_ITEM")
private java.lang.String QUANTITY_NEEDED_PER_ITEM;

@org.kie.api.definition.type.Label("ITEM_LENGTH")
private java.lang.String ITEM_LENGTH;

@org.kie.api.definition.type.Label("ITEM_WIDTH")
private java.lang.String ITEM_WIDTH;

@org.kie.api.definition.type.Label("ITEM_HEIGHT")
private java.lang.String ITEM_HEIGHT;

@org.kie.api.definition.type.Label("ITEM_WEIGHT")
private java.lang.String ITEM_WEIGHT;

@org.kie.api.definition.type.Label("LOGISTICS_UNIT")
private java.lang.String LOGISTICS_UNIT;

@org.kie.api.definition.type.Label("PARENT_LOGISTICS_UNIT")
private java.lang.String PARENT_LOGISTICS_UNIT;

@org.kie.api.definition.type.Label("STORE_DISTRIBUTION")
private java.lang.String STORE_DISTRIBUTION;

@org.kie.api.definition.type.Label("IMMEDIATE_NEEDS_ELIGIBLE")
private java.lang.String IMMEDIATE_NEEDS_ELIGIBLE;

@org.kie.api.definition.type.Label("IMMEDIATE_NEEDS_LOC_RULE")
private java.lang.String IMMEDIATE_NEEDS_LOC_RULE;

@org.kie.api.definition.type.Label("ECCN")
private java.lang.String ECCN;

@org.kie.api.definition.type.Label("VALIDATED_LICENSE")
private java.lang.String VALIDATED_LICENSE;

@org.kie.api.definition.type.Label("LICENSE_EXP_DATE")
private java.lang.String LICENSE_EXP_DATE;

    public OrderDetail() {
    }
	
	public java.lang.String getINTERFACE_RECORD_ID() {
return this.INTERFACE_RECORD_ID;
}

public java.lang.String getSTATUS_FLOW_NAME() {
return this.STATUS_FLOW_NAME;
}

public java.lang.String getwarehouse() {
return this.warehouse;
}

public java.lang.String getCOMPANY() {
return this.COMPANY;
}

public java.lang.String getALLOCATION_RULE() {
return this.ALLOCATION_RULE;
}

public java.lang.String getINTERFACE_LINK_ID() {
return this.INTERFACE_LINK_ID;
}

public java.lang.String getINTERFACE_ACTION_CODE() {
return this.INTERFACE_ACTION_CODE;
}

public java.lang.String getINTERFACE_CONDITION() {
return this.INTERFACE_CONDITION;
}

public java.lang.String getINTERFACE_ERROR() {
return this.INTERFACE_ERROR;
}

public java.lang.String getCATALOG_ID() {
return this.CATALOG_ID;
}

public java.lang.String getCATCH_WEIGHT_REQD() {
return this.CATCH_WEIGHT_REQD;
}

public java.lang.String getCUSTOMER_PO() {
return this.CUSTOMER_PO;
}

public java.lang.String getERP_ORDER() {
return this.ERP_ORDER;
}

public java.lang.String getERP_ORDER_LINE_NUM() {
return this.ERP_ORDER_LINE_NUM;
}

public java.lang.String getHAZARDOUS_CODE() {
return this.HAZARDOUS_CODE;
}

public java.lang.String getINITIAL_QTY() {
return this.INITIAL_QTY;
}

public java.lang.String getINITIAL_VALUE() {
return this.INITIAL_VALUE;
}

public java.lang.String getINITIAL_VOLUME() {
return this.INITIAL_VOLUME;
}

public java.lang.String getINITIAL_WEIGHT() {
return this.INITIAL_WEIGHT;
}

public java.lang.String getINVOICE() {
return this.INVOICE;
}

public java.lang.String getITEM() {
return this.ITEM;
}

public java.lang.String getITEM_CLASS() {
return this.ITEM_CLASS;
}

public java.lang.String getITEM_COLOR() {
return this.ITEM_COLOR;
}

public java.lang.String getITEM_DEPARTMENT() {
return this.ITEM_DEPARTMENT;
}

public java.lang.String getITEM_DESC() {
return this.ITEM_DESC;
}

public java.lang.String getITEM_DIMENSION_UM() {
return this.ITEM_DIMENSION_UM;
}

public java.lang.String getITEM_DIVISION() {
return this.ITEM_DIVISION;
}

public java.lang.String getITEM_LIST_PRICE() {
return this.ITEM_LIST_PRICE;
}

public java.lang.String getITEM_NET_PRICE() {
return this.ITEM_NET_PRICE;
}

public java.lang.String getITEM_SIZE() {
return this.ITEM_SIZE;
}

public java.lang.String getITEM_STYLE() {
return this.ITEM_STYLE;
}

public java.lang.String getLOT() {
return this.LOT;
}

public java.lang.String getLOT_CONTROLLED() {
return this.LOT_CONTROLLED;
}

public java.lang.String getMANUFACTURER_ID() {
return this.MANUFACTURER_ID;
}

public java.lang.String getMARK_FOR() {
return this.MARK_FOR;
}

public java.lang.String getMARK_FOR_ADDRESS1() {
return this.MARK_FOR_ADDRESS1;
}

public java.lang.String getMARK_FOR_ADDRESS2() {
return this.MARK_FOR_ADDRESS2;
}

public java.lang.String getMARK_FOR_ADDRESS3() {
return this.MARK_FOR_ADDRESS3;
}

public java.lang.String getMARK_FOR_ATTENTION_TO() {
return this.MARK_FOR_ATTENTION_TO;
}

public java.lang.String getMARK_FOR_CITY() {
return this.MARK_FOR_CITY;
}

public java.lang.String getMARK_FOR_COUNTRY() {
return this.MARK_FOR_COUNTRY;
}

public java.lang.String getMARK_FOR_EMAIL_ADDRESS() {
return this.MARK_FOR_EMAIL_ADDRESS;
}

public java.lang.String getMARK_FOR_FAX_NUM() {
return this.MARK_FOR_FAX_NUM;
}

public java.lang.String getMARK_FOR_NAME() {
return this.MARK_FOR_NAME;
}

public java.lang.String getMARK_FOR_PHONE_NUM() {
return this.MARK_FOR_PHONE_NUM;
}

public java.lang.String getMARK_FOR_POSTAL_CODE() {
return this.MARK_FOR_POSTAL_CODE;
}

public java.lang.String getMARK_FOR_STATE() {
return this.MARK_FOR_STATE;
}

public java.lang.String getMERCHANDISE_CODE() {
return this.MERCHANDISE_CODE;
}

public java.lang.String getNMFC_CODE() {
return this.NMFC_CODE;
}

public java.lang.String getOPEN_QTY() {
return this.OPEN_QTY;
}

public java.lang.String getORDER_DATE() {
return this.ORDER_DATE;
}

public java.lang.String getORDER_PRIORITY() {
return this.ORDER_PRIORITY;
}

public java.lang.String getORIGINAL_ITEM_ORDERED() {
return this.ORIGINAL_ITEM_ORDERED;
}

public java.lang.String getPACKING_CATEGORY() {
return this.PACKING_CATEGORY;
}

public java.lang.String getPICK_LIST_ID() {
return this.PICK_LIST_ID;
}

public java.lang.String getPICK_LOC() {
return this.PICK_LOC;
}

public java.lang.String getPICK_ZONE() {
return this.PICK_ZONE;
}

public java.lang.String getPLANNED_SHIP_DATE() {
return this.PLANNED_SHIP_DATE;
}

public java.lang.String getPRIORITY() {
return this.PRIORITY;
}

public java.lang.String getQUANTITY_UM() {
return this.QUANTITY_UM;
}

public java.lang.String getREQUESTED_DELIVERY_DATE() {
return this.REQUESTED_DELIVERY_DATE;
}

public java.lang.String getREQUESTED_DELIVERY_TYPE() {
return this.REQUESTED_DELIVERY_TYPE;
}

public java.lang.String getREQUESTED_QTY() {
return this.REQUESTED_QTY;
}

public java.lang.String getSECONDARY_PICK_LOC() {
return this.SECONDARY_PICK_LOC;
}

public java.lang.String getSECONDARY_PICK_ZONE() {
return this.SECONDARY_PICK_ZONE;
}

public java.lang.String getSERIAL_NUM_REQD() {
return this.SERIAL_NUM_REQD;
}

public java.lang.String getSHIPMENT_ID() {
return this.SHIPMENT_ID;
}

public java.lang.String getSHIPPED_QTY() {
return this.SHIPPED_QTY;
}

public java.lang.String getTOTAL_QTY() {
return this.TOTAL_QTY;
}

public java.lang.String getVALUE_ADD_LABEL_CODE() {
return this.VALUE_ADD_LABEL_CODE;
}

public java.lang.String getVOLUME_UM() {
return this.VOLUME_UM;
}

public java.lang.String getWEIGHT_UM() {
return this.WEIGHT_UM;
}

public java.lang.String getUSER_DEF1() {
return this.USER_DEF1;
}

public java.lang.String getUSER_DEF2() {
return this.USER_DEF2;
}

public java.lang.String getUSER_DEF3() {
return this.USER_DEF3;
}

public java.lang.String getUSER_DEF4() {
return this.USER_DEF4;
}

public java.lang.String getUSER_DEF5() {
return this.USER_DEF5;
}

public java.lang.String getUSER_DEF6() {
return this.USER_DEF6;
}

public java.lang.String getUSER_DEF7() {
return this.USER_DEF7;
}

public java.lang.String getUSER_DEF8() {
return this.USER_DEF8;
}

public java.lang.String getUSER_STAMP() {
return this.USER_STAMP;
}

public java.lang.String getPROCESS_STAMP() {
return this.PROCESS_STAMP;
}

public java.lang.String getDATE_TIME_STAMP() {
return this.DATE_TIME_STAMP;
}

public java.lang.String getTMP_INTERNAL_ORDER_NUM() {
return this.TMP_INTERNAL_ORDER_NUM;
}

public java.lang.String getTMP_INTERNAL_SHIPMENT_NUM() {
return this.TMP_INTERNAL_SHIPMENT_NUM;
}

public java.lang.String getTMP_INTERNAL_SHIPMENT_LINE_NUM() {
return this.TMP_INTERNAL_SHIPMENT_LINE_NUM;
}

public java.lang.String getHARMONIZED_CODE() {
return this.HARMONIZED_CODE;
}

public java.lang.String getHARMONIZED_DESC() {
return this.HARMONIZED_DESC;
}

public java.lang.String getEXPORT_DESC() {
return this.EXPORT_DESC;
}

public java.lang.String getPREFERENCE_CRIT() {
return this.PREFERENCE_CRIT;
}

public java.lang.String getNET_COST() {
return this.NET_COST;
}

public java.lang.String getCOUNTRY_OF_ORIGIN() {
return this.COUNTRY_OF_ORIGIN;
}

public java.lang.String getPRODUCER() {
return this.PRODUCER;
}

public java.lang.String getCUSTOMER_ITEM() {
return this.CUSTOMER_ITEM;
}

public java.lang.String getTMP_INTERNAL_ORDER_DTL_NUM() {
return this.TMP_INTERNAL_ORDER_DTL_NUM;
}

public java.lang.String getITEM_CATEGORY1() {
return this.ITEM_CATEGORY1;
}

public java.lang.String getITEM_CATEGORY2() {
return this.ITEM_CATEGORY2;
}

public java.lang.String getITEM_CATEGORY3() {
return this.ITEM_CATEGORY3;
}

public java.lang.String getITEM_CATEGORY4() {
return this.ITEM_CATEGORY4;
}

public java.lang.String getITEM_CATEGORY5() {
return this.ITEM_CATEGORY5;
}

public java.lang.String getITEM_CATEGORY6() {
return this.ITEM_CATEGORY6;
}

public java.lang.String getITEM_CATEGORY7() {
return this.ITEM_CATEGORY7;
}

public java.lang.String getITEM_CATEGORY8() {
return this.ITEM_CATEGORY8;
}

public java.lang.String getITEM_CATEGORY9() {
return this.ITEM_CATEGORY9;
}

public java.lang.String getITEM_CATEGORY10() {
return this.ITEM_CATEGORY10;
}

public java.lang.String getCONT_CREATION_FULL_QTY() {
return this.CONT_CREATION_FULL_QTY;
}

public java.lang.String getCONT_CREATION_FULL_QTY_UM() {
return this.CONT_CREATION_FULL_QTY_UM;
}

public java.lang.String getCONT_CREATION_INNERPACK_QTY() {
return this.CONT_CREATION_INNERPACK_QTY;
}

public java.lang.String getPACKING_CLASS() {
return this.PACKING_CLASS;
}

public java.lang.String getALLOCATE_FULL_LOC_QTY() {
return this.ALLOCATE_FULL_LOC_QTY;
}

public java.lang.String getALLOW_PCT_ALLOC() {
return this.ALLOW_PCT_ALLOC;
}

public java.lang.String getMINIMUM_ALLOC_PCT() {
return this.MINIMUM_ALLOC_PCT;
}

public java.lang.String getMAXIMUM_ALLOC_PCT() {
return this.MAXIMUM_ALLOC_PCT;
}

public java.lang.String getIMMEDIATE_NEEDS_NOTE() {
return this.IMMEDIATE_NEEDS_NOTE;
}

public java.lang.String getVALUE() {
return this.VALUE;
}

public java.lang.String getTREAT_AS_LOOSE() {
return this.TREAT_AS_LOOSE;
}

public java.lang.String getBOM_ACTION() {
return this.BOM_ACTION;
}

public java.lang.String getQUANTITY_NEEDED_PER_ITEM() {
return this.QUANTITY_NEEDED_PER_ITEM;
}

public java.lang.String getITEM_LENGTH() {
return this.ITEM_LENGTH;
}

public java.lang.String getITEM_WIDTH() {
return this.ITEM_WIDTH;
}

public java.lang.String getITEM_HEIGHT() {
return this.ITEM_HEIGHT;
}

public java.lang.String getITEM_WEIGHT() {
return this.ITEM_WEIGHT;
}

public java.lang.String getLOGISTICS_UNIT() {
return this.LOGISTICS_UNIT;
}

public java.lang.String getPARENT_LOGISTICS_UNIT() {
return this.PARENT_LOGISTICS_UNIT;
}

public java.lang.String getSTORE_DISTRIBUTION() {
return this.STORE_DISTRIBUTION;
}

public java.lang.String getIMMEDIATE_NEEDS_ELIGIBLE() {
return this.IMMEDIATE_NEEDS_ELIGIBLE;
}

public java.lang.String getIMMEDIATE_NEEDS_LOC_RULE() {
return this.IMMEDIATE_NEEDS_LOC_RULE;
}

public java.lang.String getECCN() {
return this.ECCN;
}

public java.lang.String getVALIDATED_LICENSE() {
return this.VALIDATED_LICENSE;
}

public java.lang.String getLICENSE_EXP_DATE() {
return this.LICENSE_EXP_DATE;
}


public OrderDetail(
java.lang.String INTERFACE_RECORD_ID,
java.lang.String STATUS_FLOW_NAME,
java.lang.String warehouse,
java.lang.String COMPANY,
java.lang.String ALLOCATION_RULE,
java.lang.String INTERFACE_LINK_ID,
java.lang.String INTERFACE_ACTION_CODE,
java.lang.String INTERFACE_CONDITION,
java.lang.String INTERFACE_ERROR,
java.lang.String CATALOG_ID,
java.lang.String CATCH_WEIGHT_REQD,
java.lang.String CUSTOMER_PO,
java.lang.String ERP_ORDER,
java.lang.String ERP_ORDER_LINE_NUM,
java.lang.String HAZARDOUS_CODE,
java.lang.String INITIAL_QTY,
java.lang.String INITIAL_VALUE,
java.lang.String INITIAL_VOLUME,
java.lang.String INITIAL_WEIGHT,
java.lang.String INVOICE,
java.lang.String ITEM,
java.lang.String ITEM_CLASS,
java.lang.String ITEM_COLOR,
java.lang.String ITEM_DEPARTMENT,
java.lang.String ITEM_DESC,
java.lang.String ITEM_DIMENSION_UM,
java.lang.String ITEM_DIVISION,
java.lang.String ITEM_LIST_PRICE,
java.lang.String ITEM_NET_PRICE,
java.lang.String ITEM_SIZE,
java.lang.String ITEM_STYLE,
java.lang.String LOT,
java.lang.String LOT_CONTROLLED,
java.lang.String MANUFACTURER_ID,
java.lang.String MARK_FOR,
java.lang.String MARK_FOR_ADDRESS1,
java.lang.String MARK_FOR_ADDRESS2,
java.lang.String MARK_FOR_ADDRESS3,
java.lang.String MARK_FOR_ATTENTION_TO,
java.lang.String MARK_FOR_CITY,
java.lang.String MARK_FOR_COUNTRY,
java.lang.String MARK_FOR_EMAIL_ADDRESS,
java.lang.String MARK_FOR_FAX_NUM,
java.lang.String MARK_FOR_NAME,
java.lang.String MARK_FOR_PHONE_NUM,
java.lang.String MARK_FOR_POSTAL_CODE,
java.lang.String MARK_FOR_STATE,
java.lang.String MERCHANDISE_CODE,
java.lang.String NMFC_CODE,
java.lang.String OPEN_QTY,
java.lang.String ORDER_DATE,
java.lang.String ORDER_PRIORITY,
java.lang.String ORIGINAL_ITEM_ORDERED,
java.lang.String PACKING_CATEGORY,
java.lang.String PICK_LIST_ID,
java.lang.String PICK_LOC,
java.lang.String PICK_ZONE,
java.lang.String PLANNED_SHIP_DATE,
java.lang.String PRIORITY,
java.lang.String QUANTITY_UM,
java.lang.String REQUESTED_DELIVERY_DATE,
java.lang.String REQUESTED_DELIVERY_TYPE,
java.lang.String REQUESTED_QTY,
java.lang.String SECONDARY_PICK_LOC,
java.lang.String SECONDARY_PICK_ZONE,
java.lang.String SERIAL_NUM_REQD,
java.lang.String SHIPMENT_ID,
java.lang.String SHIPPED_QTY,
java.lang.String TOTAL_QTY,
java.lang.String VALUE_ADD_LABEL_CODE,
java.lang.String VOLUME_UM,
java.lang.String WEIGHT_UM,
java.lang.String USER_DEF1,
java.lang.String USER_DEF2,
java.lang.String USER_DEF3,
java.lang.String USER_DEF4,
java.lang.String USER_DEF5,
java.lang.String USER_DEF6,
java.lang.String USER_DEF7,
java.lang.String USER_DEF8,
java.lang.String USER_STAMP,
java.lang.String PROCESS_STAMP,
java.lang.String DATE_TIME_STAMP,
java.lang.String TMP_INTERNAL_ORDER_NUM,
java.lang.String TMP_INTERNAL_SHIPMENT_NUM,
java.lang.String TMP_INTERNAL_SHIPMENT_LINE_NUM,
java.lang.String HARMONIZED_CODE,
java.lang.String HARMONIZED_DESC,
java.lang.String EXPORT_DESC,
java.lang.String PREFERENCE_CRIT,
java.lang.String NET_COST,
java.lang.String COUNTRY_OF_ORIGIN,
java.lang.String PRODUCER,
java.lang.String CUSTOMER_ITEM,
java.lang.String TMP_INTERNAL_ORDER_DTL_NUM,
java.lang.String ITEM_CATEGORY1,
java.lang.String ITEM_CATEGORY2,
java.lang.String ITEM_CATEGORY3,
java.lang.String ITEM_CATEGORY4,
java.lang.String ITEM_CATEGORY5,
java.lang.String ITEM_CATEGORY6,
java.lang.String ITEM_CATEGORY7,
java.lang.String ITEM_CATEGORY8,
java.lang.String ITEM_CATEGORY9,
java.lang.String ITEM_CATEGORY10,
java.lang.String CONT_CREATION_FULL_QTY,
java.lang.String CONT_CREATION_FULL_QTY_UM,
java.lang.String CONT_CREATION_INNERPACK_QTY,
java.lang.String PACKING_CLASS,
java.lang.String ALLOCATE_FULL_LOC_QTY,
java.lang.String ALLOW_PCT_ALLOC,
java.lang.String MINIMUM_ALLOC_PCT,
java.lang.String MAXIMUM_ALLOC_PCT,
java.lang.String IMMEDIATE_NEEDS_NOTE,
java.lang.String VALUE,
java.lang.String TREAT_AS_LOOSE,
java.lang.String BOM_ACTION,
java.lang.String QUANTITY_NEEDED_PER_ITEM,
java.lang.String ITEM_LENGTH,
java.lang.String ITEM_WIDTH,
java.lang.String ITEM_HEIGHT,
java.lang.String ITEM_WEIGHT,
java.lang.String LOGISTICS_UNIT,
java.lang.String PARENT_LOGISTICS_UNIT,
java.lang.String STORE_DISTRIBUTION,
java.lang.String IMMEDIATE_NEEDS_ELIGIBLE,
java.lang.String IMMEDIATE_NEEDS_LOC_RULE,
java.lang.String ECCN,
java.lang.String VALIDATED_LICENSE,
java.lang.String LICENSE_EXP_DATE
)
{
this.INTERFACE_RECORD_ID = INTERFACE_RECORD_ID;
this.STATUS_FLOW_NAME = STATUS_FLOW_NAME;
this.warehouse = warehouse;
this.COMPANY = COMPANY;
this.ALLOCATION_RULE = ALLOCATION_RULE;
this.INTERFACE_LINK_ID = INTERFACE_LINK_ID;
this.INTERFACE_ACTION_CODE = INTERFACE_ACTION_CODE;
this.INTERFACE_CONDITION = INTERFACE_CONDITION;
this.INTERFACE_ERROR = INTERFACE_ERROR;
this.CATALOG_ID = CATALOG_ID;
this.CATCH_WEIGHT_REQD = CATCH_WEIGHT_REQD;
this.CUSTOMER_PO = CUSTOMER_PO;
this.ERP_ORDER = ERP_ORDER;
this.ERP_ORDER_LINE_NUM = ERP_ORDER_LINE_NUM;
this.HAZARDOUS_CODE = HAZARDOUS_CODE;
this.INITIAL_QTY = INITIAL_QTY;
this.INITIAL_VALUE = INITIAL_VALUE;
this.INITIAL_VOLUME = INITIAL_VOLUME;
this.INITIAL_WEIGHT = INITIAL_WEIGHT;
this.INVOICE = INVOICE;
this.ITEM = ITEM;
this.ITEM_CLASS = ITEM_CLASS;
this.ITEM_COLOR = ITEM_COLOR;
this.ITEM_DEPARTMENT = ITEM_DEPARTMENT;
this.ITEM_DESC = ITEM_DESC;
this.ITEM_DIMENSION_UM = ITEM_DIMENSION_UM;
this.ITEM_DIVISION = ITEM_DIVISION;
this.ITEM_LIST_PRICE = ITEM_LIST_PRICE;
this.ITEM_NET_PRICE = ITEM_NET_PRICE;
this.ITEM_SIZE = ITEM_SIZE;
this.ITEM_STYLE = ITEM_STYLE;
this.LOT = LOT;
this.LOT_CONTROLLED = LOT_CONTROLLED;
this.MANUFACTURER_ID = MANUFACTURER_ID;
this.MARK_FOR = MARK_FOR;
this.MARK_FOR_ADDRESS1 = MARK_FOR_ADDRESS1;
this.MARK_FOR_ADDRESS2 = MARK_FOR_ADDRESS2;
this.MARK_FOR_ADDRESS3 = MARK_FOR_ADDRESS3;
this.MARK_FOR_ATTENTION_TO = MARK_FOR_ATTENTION_TO;
this.MARK_FOR_CITY = MARK_FOR_CITY;
this.MARK_FOR_COUNTRY = MARK_FOR_COUNTRY;
this.MARK_FOR_EMAIL_ADDRESS = MARK_FOR_EMAIL_ADDRESS;
this.MARK_FOR_FAX_NUM = MARK_FOR_FAX_NUM;
this.MARK_FOR_NAME = MARK_FOR_NAME;
this.MARK_FOR_PHONE_NUM = MARK_FOR_PHONE_NUM;
this.MARK_FOR_POSTAL_CODE = MARK_FOR_POSTAL_CODE;
this.MARK_FOR_STATE = MARK_FOR_STATE;
this.MERCHANDISE_CODE = MERCHANDISE_CODE;
this.NMFC_CODE = NMFC_CODE;
this.OPEN_QTY = OPEN_QTY;
this.ORDER_DATE = ORDER_DATE;
this.ORDER_PRIORITY = ORDER_PRIORITY;
this.ORIGINAL_ITEM_ORDERED = ORIGINAL_ITEM_ORDERED;
this.PACKING_CATEGORY = PACKING_CATEGORY;
this.PICK_LIST_ID = PICK_LIST_ID;
this.PICK_LOC = PICK_LOC;
this.PICK_ZONE = PICK_ZONE;
this.PLANNED_SHIP_DATE = PLANNED_SHIP_DATE;
this.PRIORITY = PRIORITY;
this.QUANTITY_UM = QUANTITY_UM;
this.REQUESTED_DELIVERY_DATE = REQUESTED_DELIVERY_DATE;
this.REQUESTED_DELIVERY_TYPE = REQUESTED_DELIVERY_TYPE;
this.REQUESTED_QTY = REQUESTED_QTY;
this.SECONDARY_PICK_LOC = SECONDARY_PICK_LOC;
this.SECONDARY_PICK_ZONE = SECONDARY_PICK_ZONE;
this.SERIAL_NUM_REQD = SERIAL_NUM_REQD;
this.SHIPMENT_ID = SHIPMENT_ID;
this.SHIPPED_QTY = SHIPPED_QTY;
this.TOTAL_QTY = TOTAL_QTY;
this.VALUE_ADD_LABEL_CODE = VALUE_ADD_LABEL_CODE;
this.VOLUME_UM = VOLUME_UM;
this.WEIGHT_UM = WEIGHT_UM;
this.USER_DEF1 = USER_DEF1;
this.USER_DEF2 = USER_DEF2;
this.USER_DEF3 = USER_DEF3;
this.USER_DEF4 = USER_DEF4;
this.USER_DEF5 = USER_DEF5;
this.USER_DEF6 = USER_DEF6;
this.USER_DEF7 = USER_DEF7;
this.USER_DEF8 = USER_DEF8;
this.USER_STAMP = USER_STAMP;
this.PROCESS_STAMP = PROCESS_STAMP;
this.DATE_TIME_STAMP = DATE_TIME_STAMP;
this.TMP_INTERNAL_ORDER_NUM = TMP_INTERNAL_ORDER_NUM;
this.TMP_INTERNAL_SHIPMENT_NUM = TMP_INTERNAL_SHIPMENT_NUM;
this.TMP_INTERNAL_SHIPMENT_LINE_NUM = TMP_INTERNAL_SHIPMENT_LINE_NUM;
this.HARMONIZED_CODE = HARMONIZED_CODE;
this.HARMONIZED_DESC = HARMONIZED_DESC;
this.EXPORT_DESC = EXPORT_DESC;
this.PREFERENCE_CRIT = PREFERENCE_CRIT;
this.NET_COST = NET_COST;
this.COUNTRY_OF_ORIGIN = COUNTRY_OF_ORIGIN;
this.PRODUCER = PRODUCER;
this.CUSTOMER_ITEM = CUSTOMER_ITEM;
this.TMP_INTERNAL_ORDER_DTL_NUM = TMP_INTERNAL_ORDER_DTL_NUM;
this.ITEM_CATEGORY1 = ITEM_CATEGORY1;
this.ITEM_CATEGORY2 = ITEM_CATEGORY2;
this.ITEM_CATEGORY3 = ITEM_CATEGORY3;
this.ITEM_CATEGORY4 = ITEM_CATEGORY4;
this.ITEM_CATEGORY5 = ITEM_CATEGORY5;
this.ITEM_CATEGORY6 = ITEM_CATEGORY6;
this.ITEM_CATEGORY7 = ITEM_CATEGORY7;
this.ITEM_CATEGORY8 = ITEM_CATEGORY8;
this.ITEM_CATEGORY9 = ITEM_CATEGORY9;
this.ITEM_CATEGORY10 = ITEM_CATEGORY10;
this.CONT_CREATION_FULL_QTY = CONT_CREATION_FULL_QTY;
this.CONT_CREATION_FULL_QTY_UM = CONT_CREATION_FULL_QTY_UM;
this.CONT_CREATION_INNERPACK_QTY = CONT_CREATION_INNERPACK_QTY;
this.PACKING_CLASS = PACKING_CLASS;
this.ALLOCATE_FULL_LOC_QTY = ALLOCATE_FULL_LOC_QTY;
this.ALLOW_PCT_ALLOC = ALLOW_PCT_ALLOC;
this.MINIMUM_ALLOC_PCT = MINIMUM_ALLOC_PCT;
this.MAXIMUM_ALLOC_PCT = MAXIMUM_ALLOC_PCT;
this.IMMEDIATE_NEEDS_NOTE = IMMEDIATE_NEEDS_NOTE;
this.VALUE = VALUE;
this.TREAT_AS_LOOSE = TREAT_AS_LOOSE;
this.BOM_ACTION = BOM_ACTION;
this.QUANTITY_NEEDED_PER_ITEM = QUANTITY_NEEDED_PER_ITEM;
this.ITEM_LENGTH = ITEM_LENGTH;
this.ITEM_WIDTH = ITEM_WIDTH;
this.ITEM_HEIGHT = ITEM_HEIGHT;
this.ITEM_WEIGHT = ITEM_WEIGHT;
this.LOGISTICS_UNIT = LOGISTICS_UNIT;
this.PARENT_LOGISTICS_UNIT = PARENT_LOGISTICS_UNIT;
this.STORE_DISTRIBUTION = STORE_DISTRIBUTION;
this.IMMEDIATE_NEEDS_ELIGIBLE = IMMEDIATE_NEEDS_ELIGIBLE;
this.IMMEDIATE_NEEDS_LOC_RULE = IMMEDIATE_NEEDS_LOC_RULE;
this.ECCN = ECCN;
this.VALIDATED_LICENSE = VALIDATED_LICENSE;
this.LICENSE_EXP_DATE = LICENSE_EXP_DATE;
}

}