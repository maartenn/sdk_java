package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * View for RegistryMembership.
 */
public class RegistryMembership extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_AUTO_ADD_CARD_TRANSACTION = "auto_add_card_transaction";

  /**
   * The LabelMonetaryAccount of the user who belongs to this RegistryMembership.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The balance of this RegistryMembership.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The total amount spent of this RegistryMembership.
   */
  @Expose
  @SerializedName("total_amount_spent")
  private Amount totalAmountSpent;

  /**
   * The status of the RegistryMembership.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The status of the settlement of the Registry. Can be PENDING or SETTLED.
   */
  @Expose
  @SerializedName("status_settlement")
  private String statusSettlement;

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  @Expose
  @SerializedName("auto_add_card_transaction")
  private String autoAddCardTransaction;

  /**
   * The registry id.
   */
  @Expose
  @SerializedName("registry_id")
  private Integer registryId;

  /**
   * The registry title.
   */
  @Expose
  @SerializedName("registry_title")
  private String registryTitle;

  /**
   * The label of the user that sent the invite.
   */
  @Expose
  @SerializedName("invitor")
  private LabelUser invitor;

  /**
   * The Alias of the party we are inviting to the Registry.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The status of the RegistryMembership.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  @Expose
  @SerializedName("auto_add_card_transaction_field_for_request")
  private String autoAddCardTransactionFieldForRequest;

  public RegistryMembership() {
  this(null, null, null);
  }

  public RegistryMembership(Pointer alias) {
  this(alias, null, null);
  }

  public RegistryMembership(Pointer alias, String status) {
  this(alias, status, null);
  }

  public RegistryMembership(Pointer alias, String status, String autoAddCardTransaction) {
    this.aliasFieldForRequest = alias;
    this.statusFieldForRequest = status;
    this.autoAddCardTransactionFieldForRequest = autoAddCardTransaction;
  }

  /**
   * The LabelMonetaryAccount of the user who belongs to this RegistryMembership.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The balance of this RegistryMembership.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The total amount spent of this RegistryMembership.
   */
  public Amount getTotalAmountSpent() {
    return this.totalAmountSpent;
  }

  public void setTotalAmountSpent(Amount totalAmountSpent) {
    this.totalAmountSpent = totalAmountSpent;
  }

  /**
   * The status of the RegistryMembership.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The status of the settlement of the Registry. Can be PENDING or SETTLED.
   */
  public String getStatusSettlement() {
    return this.statusSettlement;
  }

  public void setStatusSettlement(String statusSettlement) {
    this.statusSettlement = statusSettlement;
  }

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  public String getAutoAddCardTransaction() {
    return this.autoAddCardTransaction;
  }

  public void setAutoAddCardTransaction(String autoAddCardTransaction) {
    this.autoAddCardTransaction = autoAddCardTransaction;
  }

  /**
   * The registry id.
   */
  public Integer getRegistryId() {
    return this.registryId;
  }

  public void setRegistryId(Integer registryId) {
    this.registryId = registryId;
  }

  /**
   * The registry title.
   */
  public String getRegistryTitle() {
    return this.registryTitle;
  }

  public void setRegistryTitle(String registryTitle) {
    this.registryTitle = registryTitle;
  }

  /**
   * The label of the user that sent the invite.
   */
  public LabelUser getInvitor() {
    return this.invitor;
  }

  public void setInvitor(LabelUser invitor) {
    this.invitor = invitor;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.alias != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.totalAmountSpent != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.statusSettlement != null) {
      return false;
    }

    if (this.autoAddCardTransaction != null) {
      return false;
    }

    if (this.registryId != null) {
      return false;
    }

    if (this.registryTitle != null) {
      return false;
    }

    if (this.invitor != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryMembership fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryMembership.class, reader);
  }

}
