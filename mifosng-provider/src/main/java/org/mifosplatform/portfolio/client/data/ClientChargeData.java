package org.mifosplatform.portfolio.client.data;

import java.math.BigDecimal;
import java.util.Collection;

import org.joda.time.LocalDate;
import org.mifosplatform.infrastructure.core.data.EnumOptionData;
import org.mifosplatform.organisation.monetary.data.CurrencyData;
import org.mifosplatform.portfolio.charge.data.ChargeData;

@SuppressWarnings("unused")
public class ClientChargeData {

    private final Long id;

    private final Long clientId;

    private final Long chargeId;

    private final String name;

    private final EnumOptionData chargeTimeType;

    private final LocalDate dueDate;

    private final EnumOptionData chargeCalculationType;

    private final CurrencyData currency;

    private final BigDecimal amount;

    private final BigDecimal amountPaid;

    private final BigDecimal amountWaived;

    private final BigDecimal amountWrittenOff;

    private final BigDecimal amountOutstanding;

    private final boolean penalty;

    private final Boolean isActive;

    private final LocalDate inactivationDate;

    private final Collection<ChargeData> chargeOptions;

    public static ClientChargeData instance(Long id, Long clientId, Long chargeId, String name, EnumOptionData chargeTimeType,
            LocalDate dueDate, EnumOptionData chargeCalculationType, CurrencyData currency, BigDecimal amount, BigDecimal amountPaid,
            BigDecimal amountWaived, BigDecimal amountWrittenOff, BigDecimal amountOutstanding, boolean penalty, Boolean isActive,
            LocalDate inactivationDate, Collection<ChargeData> chargeOptions) {

        return new ClientChargeData(id, clientId, chargeId, name, chargeTimeType, dueDate, chargeCalculationType, currency, amount,
                amountPaid, amountWaived, amountWrittenOff, amountOutstanding, penalty, isActive, inactivationDate, chargeOptions);
    }

    public static ClientChargeData template(final Collection<ChargeData> chargeOptions) {
        final Long id = null;
        final Long clientId = null;
        final Long chargeId = null;
        final String name = null;
        final EnumOptionData chargeTimeType = null;
        final LocalDate dueDate = null;
        final EnumOptionData chargeCalculationType = null;
        final CurrencyData currency = null;
        final BigDecimal amount = null;
        final BigDecimal amountPaid = null;
        final BigDecimal amountWaived = null;
        final BigDecimal amountWrittenOff = null;
        final BigDecimal amountOutstanding = null;
        final Boolean penalty = false;
        final Boolean isActive = null;
        final LocalDate inactivationDate = null;

        return new ClientChargeData(id, clientId, chargeId, name, chargeTimeType, dueDate, chargeCalculationType, currency, amount,
                amountPaid, amountWaived, amountWrittenOff, amountOutstanding, penalty, isActive, inactivationDate, chargeOptions);
    }

    private ClientChargeData(Long id, Long clientId, Long chargeId, String name, EnumOptionData chargeTimeType, LocalDate dueDate,
            EnumOptionData chargeCalculationType, CurrencyData currency, BigDecimal amount, BigDecimal amountPaid, BigDecimal amountWaived,
            BigDecimal amountWrittenOff, BigDecimal amountOutstanding, boolean penalty, Boolean isActive, LocalDate inactivationDate,
            Collection<ChargeData> chargeOptions) {
        super();
        this.id = id;
        this.clientId = clientId;
        this.chargeId = chargeId;
        this.name = name;
        this.chargeTimeType = chargeTimeType;
        this.dueDate = dueDate;
        this.chargeCalculationType = chargeCalculationType;
        this.currency = currency;
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountWaived = amountWaived;
        this.amountWrittenOff = amountWrittenOff;
        this.amountOutstanding = amountOutstanding;
        this.penalty = penalty;
        this.isActive = isActive;
        this.inactivationDate = inactivationDate;

        // template related fields
        this.chargeOptions = chargeOptions;
    }

}