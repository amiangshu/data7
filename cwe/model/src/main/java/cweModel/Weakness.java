package cweModel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}Common_Attributes"/>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Weakness_Abstraction" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Class"/>
 *             &lt;enumeration value="Base"/>
 *             &lt;enumeration value="Variant"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" use="required" type="{}Status_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "relationships",
    "relationshipNotes",
    "weaknessOrdinalities",
    "applicablePlatforms",
    "maintenanceNotes",
    "backgroundDetails",
    "otherNotes",
    "alternateTerms",
    "terminologyNotes",
    "timeOfIntroduction",
    "modesOfIntroduction",
    "enablingFactorsForExploitation",
    "likelihoodOfExploit",
    "commonConsequences",
    "detectionMethods",
    "potentialMitigations",
    "causalNature",
    "demonstrativeExamples",
    "observedExamples",
    "theoreticalNotes",
    "functionalAreas",
    "relevantProperties",
    "affectedResources",
    "researchGaps",
    "references",
    "taxonomyMappings",
    "whiteBoxDefinitions",
    "blackBoxDefinitions",
    "relatedAttackPatterns",
    "contentHistory"
})
@XmlRootElement(name = "Weakness")
public class Weakness {

    @XmlElement(name = "Description", required = true)
    protected cweModel.Category.Description description;
    @XmlElement(name = "Relationships")
    protected Relationships relationships;
    @XmlElement(name = "Relationship_Notes")
    protected RelationshipNotes relationshipNotes;
    @XmlElement(name = "Weakness_Ordinalities")
    protected cweModel.Category.WeaknessOrdinalities weaknessOrdinalities;
    @XmlElement(name = "Applicable_Platforms")
    protected cweModel.Category.ApplicablePlatforms applicablePlatforms;
    @XmlElement(name = "Maintenance_Notes")
    protected MaintenanceNotes maintenanceNotes;
    @XmlElement(name = "Background_Details")
    protected cweModel.Category.BackgroundDetails backgroundDetails;
    @XmlElement(name = "Other_Notes")
    protected OtherNotes otherNotes;
    @XmlElement(name = "Alternate_Terms")
    protected AlternateTerms alternateTerms;
    @XmlElement(name = "Terminology_Notes")
    protected cweModel.Category.TerminologyNotes terminologyNotes;
    @XmlElement(name = "Time_of_Introduction")
    protected cweModel.Category.TimeOfIntroduction timeOfIntroduction;
    @XmlElement(name = "Modes_of_Introduction")
    protected cweModel.Category.ModesOfIntroduction modesOfIntroduction;
    @XmlElement(name = "Enabling_Factors_for_Exploitation")
    protected cweModel.Category.EnablingFactorsForExploitation enablingFactorsForExploitation;
    @XmlElement(name = "Likelihood_of_Exploit")
    protected String likelihoodOfExploit;
    @XmlElement(name = "Common_Consequences")
    protected cweModel.Category.CommonConsequences commonConsequences;
    @XmlElement(name = "Detection_Methods")
    protected cweModel.Category.DetectionMethods detectionMethods;
    @XmlElement(name = "Potential_Mitigations")
    protected cweModel.Category.PotentialMitigations potentialMitigations;
    @XmlElement(name = "Causal_Nature")
    protected String causalNature;
    @XmlElement(name = "Demonstrative_Examples")
    protected cweModel.Category.DemonstrativeExamples demonstrativeExamples;
    @XmlElement(name = "Observed_Examples")
    protected cweModel.Category.ObservedExamples observedExamples;
    @XmlElement(name = "Theoretical_Notes")
    protected cweModel.Category.TheoreticalNotes theoreticalNotes;
    @XmlElement(name = "Functional_Areas")
    protected cweModel.Category.FunctionalAreas functionalAreas;
    @XmlElement(name = "Relevant_Properties")
    protected cweModel.Category.RelevantProperties relevantProperties;
    @XmlElement(name = "Affected_Resources")
    protected cweModel.Category.AffectedResources affectedResources;
    @XmlElement(name = "Research_Gaps")
    protected ResearchGaps researchGaps;
    @XmlElement(name = "References")
    protected ReferenceListType references;
    @XmlElement(name = "Taxonomy_Mappings")
    protected cweModel.Category.TaxonomyMappings taxonomyMappings;
    @XmlElement(name = "White_Box_Definitions")
    protected cweModel.Category.WhiteBoxDefinitions whiteBoxDefinitions;
    @XmlElement(name = "Black_Box_Definitions")
    protected cweModel.Category.BlackBoxDefinitions blackBoxDefinitions;
    @XmlElement(name = "Related_Attack_Patterns")
    protected cweModel.Category.RelatedAttackPatterns relatedAttackPatterns;
    @XmlElement(name = "Content_History", required = true)
    protected ContentHistory contentHistory;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Weakness_Abstraction", required = true)
    protected String weaknessAbstraction;
    @XmlAttribute(name = "Status", required = true)
    protected StatusType status;

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.Description }
     *     
     */
    public cweModel.Category.Description getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.Description }
     *     
     */
    public void setDescription(cweModel.Category.Description value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété relationships.
     * 
     * @return
     *     possible object is
     *     {@link Relationships }
     *     
     */
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * Définit la valeur de la propriété relationships.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationships }
     *     
     */
    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    /**
     * Obtient la valeur de la propriété relationshipNotes.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipNotes }
     *     
     */
    public RelationshipNotes getRelationshipNotes() {
        return relationshipNotes;
    }

    /**
     * Définit la valeur de la propriété relationshipNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipNotes }
     *     
     */
    public void setRelationshipNotes(RelationshipNotes value) {
        this.relationshipNotes = value;
    }

    /**
     * Obtient la valeur de la propriété weaknessOrdinalities.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.WeaknessOrdinalities }
     *     
     */
    public cweModel.Category.WeaknessOrdinalities getWeaknessOrdinalities() {
        return weaknessOrdinalities;
    }

    /**
     * Définit la valeur de la propriété weaknessOrdinalities.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.WeaknessOrdinalities }
     *     
     */
    public void setWeaknessOrdinalities(cweModel.Category.WeaknessOrdinalities value) {
        this.weaknessOrdinalities = value;
    }

    /**
     * Obtient la valeur de la propriété applicablePlatforms.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.ApplicablePlatforms }
     *     
     */
    public cweModel.Category.ApplicablePlatforms getApplicablePlatforms() {
        return applicablePlatforms;
    }

    /**
     * Définit la valeur de la propriété applicablePlatforms.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.ApplicablePlatforms }
     *     
     */
    public void setApplicablePlatforms(cweModel.Category.ApplicablePlatforms value) {
        this.applicablePlatforms = value;
    }

    /**
     * Obtient la valeur de la propriété maintenanceNotes.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceNotes }
     *     
     */
    public MaintenanceNotes getMaintenanceNotes() {
        return maintenanceNotes;
    }

    /**
     * Définit la valeur de la propriété maintenanceNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceNotes }
     *     
     */
    public void setMaintenanceNotes(MaintenanceNotes value) {
        this.maintenanceNotes = value;
    }

    /**
     * Obtient la valeur de la propriété backgroundDetails.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.BackgroundDetails }
     *     
     */
    public cweModel.Category.BackgroundDetails getBackgroundDetails() {
        return backgroundDetails;
    }

    /**
     * Définit la valeur de la propriété backgroundDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.BackgroundDetails }
     *     
     */
    public void setBackgroundDetails(cweModel.Category.BackgroundDetails value) {
        this.backgroundDetails = value;
    }

    /**
     * Obtient la valeur de la propriété otherNotes.
     * 
     * @return
     *     possible object is
     *     {@link OtherNotes }
     *     
     */
    public OtherNotes getOtherNotes() {
        return otherNotes;
    }

    /**
     * Définit la valeur de la propriété otherNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNotes }
     *     
     */
    public void setOtherNotes(OtherNotes value) {
        this.otherNotes = value;
    }

    /**
     * Obtient la valeur de la propriété alternateTerms.
     * 
     * @return
     *     possible object is
     *     {@link AlternateTerms }
     *     
     */
    public AlternateTerms getAlternateTerms() {
        return alternateTerms;
    }

    /**
     * Définit la valeur de la propriété alternateTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateTerms }
     *     
     */
    public void setAlternateTerms(AlternateTerms value) {
        this.alternateTerms = value;
    }

    /**
     * Obtient la valeur de la propriété terminologyNotes.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.TerminologyNotes }
     *     
     */
    public cweModel.Category.TerminologyNotes getTerminologyNotes() {
        return terminologyNotes;
    }

    /**
     * Définit la valeur de la propriété terminologyNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.TerminologyNotes }
     *     
     */
    public void setTerminologyNotes(cweModel.Category.TerminologyNotes value) {
        this.terminologyNotes = value;
    }

    /**
     * Obtient la valeur de la propriété timeOfIntroduction.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.TimeOfIntroduction }
     *     
     */
    public cweModel.Category.TimeOfIntroduction getTimeOfIntroduction() {
        return timeOfIntroduction;
    }

    /**
     * Définit la valeur de la propriété timeOfIntroduction.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.TimeOfIntroduction }
     *     
     */
    public void setTimeOfIntroduction(cweModel.Category.TimeOfIntroduction value) {
        this.timeOfIntroduction = value;
    }

    /**
     * Obtient la valeur de la propriété modesOfIntroduction.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.ModesOfIntroduction }
     *     
     */
    public cweModel.Category.ModesOfIntroduction getModesOfIntroduction() {
        return modesOfIntroduction;
    }

    /**
     * Définit la valeur de la propriété modesOfIntroduction.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.ModesOfIntroduction }
     *     
     */
    public void setModesOfIntroduction(cweModel.Category.ModesOfIntroduction value) {
        this.modesOfIntroduction = value;
    }

    /**
     * Obtient la valeur de la propriété enablingFactorsForExploitation.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.EnablingFactorsForExploitation }
     *     
     */
    public cweModel.Category.EnablingFactorsForExploitation getEnablingFactorsForExploitation() {
        return enablingFactorsForExploitation;
    }

    /**
     * Définit la valeur de la propriété enablingFactorsForExploitation.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.EnablingFactorsForExploitation }
     *     
     */
    public void setEnablingFactorsForExploitation(cweModel.Category.EnablingFactorsForExploitation value) {
        this.enablingFactorsForExploitation = value;
    }

    /**
     * Obtient la valeur de la propriété likelihoodOfExploit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLikelihoodOfExploit() {
        return likelihoodOfExploit;
    }

    /**
     * Définit la valeur de la propriété likelihoodOfExploit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLikelihoodOfExploit(String value) {
        this.likelihoodOfExploit = value;
    }

    /**
     * Obtient la valeur de la propriété commonConsequences.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.CommonConsequences }
     *     
     */
    public cweModel.Category.CommonConsequences getCommonConsequences() {
        return commonConsequences;
    }

    /**
     * Définit la valeur de la propriété commonConsequences.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.CommonConsequences }
     *     
     */
    public void setCommonConsequences(cweModel.Category.CommonConsequences value) {
        this.commonConsequences = value;
    }

    /**
     * Obtient la valeur de la propriété detectionMethods.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.DetectionMethods }
     *     
     */
    public cweModel.Category.DetectionMethods getDetectionMethods() {
        return detectionMethods;
    }

    /**
     * Définit la valeur de la propriété detectionMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.DetectionMethods }
     *     
     */
    public void setDetectionMethods(cweModel.Category.DetectionMethods value) {
        this.detectionMethods = value;
    }

    /**
     * Obtient la valeur de la propriété potentialMitigations.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.PotentialMitigations }
     *     
     */
    public cweModel.Category.PotentialMitigations getPotentialMitigations() {
        return potentialMitigations;
    }

    /**
     * Définit la valeur de la propriété potentialMitigations.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.PotentialMitigations }
     *     
     */
    public void setPotentialMitigations(cweModel.Category.PotentialMitigations value) {
        this.potentialMitigations = value;
    }

    /**
     * Obtient la valeur de la propriété causalNature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausalNature() {
        return causalNature;
    }

    /**
     * Définit la valeur de la propriété causalNature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausalNature(String value) {
        this.causalNature = value;
    }

    /**
     * Obtient la valeur de la propriété demonstrativeExamples.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.DemonstrativeExamples }
     *     
     */
    public cweModel.Category.DemonstrativeExamples getDemonstrativeExamples() {
        return demonstrativeExamples;
    }

    /**
     * Définit la valeur de la propriété demonstrativeExamples.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.DemonstrativeExamples }
     *     
     */
    public void setDemonstrativeExamples(cweModel.Category.DemonstrativeExamples value) {
        this.demonstrativeExamples = value;
    }

    /**
     * Obtient la valeur de la propriété observedExamples.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.ObservedExamples }
     *     
     */
    public cweModel.Category.ObservedExamples getObservedExamples() {
        return observedExamples;
    }

    /**
     * Définit la valeur de la propriété observedExamples.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.ObservedExamples }
     *     
     */
    public void setObservedExamples(cweModel.Category.ObservedExamples value) {
        this.observedExamples = value;
    }

    /**
     * Obtient la valeur de la propriété theoreticalNotes.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.TheoreticalNotes }
     *     
     */
    public cweModel.Category.TheoreticalNotes getTheoreticalNotes() {
        return theoreticalNotes;
    }

    /**
     * Définit la valeur de la propriété theoreticalNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.TheoreticalNotes }
     *     
     */
    public void setTheoreticalNotes(cweModel.Category.TheoreticalNotes value) {
        this.theoreticalNotes = value;
    }

    /**
     * Obtient la valeur de la propriété functionalAreas.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.FunctionalAreas }
     *     
     */
    public cweModel.Category.FunctionalAreas getFunctionalAreas() {
        return functionalAreas;
    }

    /**
     * Définit la valeur de la propriété functionalAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.FunctionalAreas }
     *     
     */
    public void setFunctionalAreas(cweModel.Category.FunctionalAreas value) {
        this.functionalAreas = value;
    }

    /**
     * Obtient la valeur de la propriété relevantProperties.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.RelevantProperties }
     *     
     */
    public cweModel.Category.RelevantProperties getRelevantProperties() {
        return relevantProperties;
    }

    /**
     * Définit la valeur de la propriété relevantProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.RelevantProperties }
     *     
     */
    public void setRelevantProperties(cweModel.Category.RelevantProperties value) {
        this.relevantProperties = value;
    }

    /**
     * Obtient la valeur de la propriété affectedResources.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.AffectedResources }
     *     
     */
    public cweModel.Category.AffectedResources getAffectedResources() {
        return affectedResources;
    }

    /**
     * Définit la valeur de la propriété affectedResources.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.AffectedResources }
     *     
     */
    public void setAffectedResources(cweModel.Category.AffectedResources value) {
        this.affectedResources = value;
    }

    /**
     * Obtient la valeur de la propriété researchGaps.
     * 
     * @return
     *     possible object is
     *     {@link ResearchGaps }
     *     
     */
    public ResearchGaps getResearchGaps() {
        return researchGaps;
    }

    /**
     * Définit la valeur de la propriété researchGaps.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchGaps }
     *     
     */
    public void setResearchGaps(ResearchGaps value) {
        this.researchGaps = value;
    }

    /**
     * Obtient la valeur de la propriété references.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceListType }
     *     
     */
    public ReferenceListType getReferences() {
        return references;
    }

    /**
     * Définit la valeur de la propriété references.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceListType }
     *     
     */
    public void setReferences(ReferenceListType value) {
        this.references = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyMappings.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.TaxonomyMappings }
     *     
     */
    public cweModel.Category.TaxonomyMappings getTaxonomyMappings() {
        return taxonomyMappings;
    }

    /**
     * Définit la valeur de la propriété taxonomyMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.TaxonomyMappings }
     *     
     */
    public void setTaxonomyMappings(cweModel.Category.TaxonomyMappings value) {
        this.taxonomyMappings = value;
    }

    /**
     * Obtient la valeur de la propriété whiteBoxDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.WhiteBoxDefinitions }
     *     
     */
    public cweModel.Category.WhiteBoxDefinitions getWhiteBoxDefinitions() {
        return whiteBoxDefinitions;
    }

    /**
     * Définit la valeur de la propriété whiteBoxDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.WhiteBoxDefinitions }
     *     
     */
    public void setWhiteBoxDefinitions(cweModel.Category.WhiteBoxDefinitions value) {
        this.whiteBoxDefinitions = value;
    }

    /**
     * Obtient la valeur de la propriété blackBoxDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.BlackBoxDefinitions }
     *     
     */
    public cweModel.Category.BlackBoxDefinitions getBlackBoxDefinitions() {
        return blackBoxDefinitions;
    }

    /**
     * Définit la valeur de la propriété blackBoxDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.BlackBoxDefinitions }
     *     
     */
    public void setBlackBoxDefinitions(cweModel.Category.BlackBoxDefinitions value) {
        this.blackBoxDefinitions = value;
    }

    /**
     * Obtient la valeur de la propriété relatedAttackPatterns.
     * 
     * @return
     *     possible object is
     *     {@link cweModel.Category.RelatedAttackPatterns }
     *     
     */
    public cweModel.Category.RelatedAttackPatterns getRelatedAttackPatterns() {
        return relatedAttackPatterns;
    }

    /**
     * Définit la valeur de la propriété relatedAttackPatterns.
     * 
     * @param value
     *     allowed object is
     *     {@link cweModel.Category.RelatedAttackPatterns }
     *     
     */
    public void setRelatedAttackPatterns(cweModel.Category.RelatedAttackPatterns value) {
        this.relatedAttackPatterns = value;
    }

    /**
     * Obtient la valeur de la propriété contentHistory.
     * 
     * @return
     *     possible object is
     *     {@link ContentHistory }
     *     
     */
    public ContentHistory getContentHistory() {
        return contentHistory;
    }

    /**
     * Définit la valeur de la propriété contentHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentHistory }
     *     
     */
    public void setContentHistory(ContentHistory value) {
        this.contentHistory = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété weaknessAbstraction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaknessAbstraction() {
        return weaknessAbstraction;
    }

    /**
     * Définit la valeur de la propriété weaknessAbstraction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaknessAbstraction(String value) {
        this.weaknessAbstraction = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
