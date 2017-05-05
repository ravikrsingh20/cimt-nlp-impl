package de.rwth.i9.cimt.nlp.constants;

/**
 * various enums for nlp taks such as tokenizer, postagger etc.
 * 
 * @author singh
 *
 */
public enum NlpModelType {

	TOKENIZER, SENTENCE_DETECTOR, POS_TAGGER, CHUNKER, PARSER, LEMMATIZER, DOCUMENT_CATEGORIZER, OTHER;

	public static NlpModelType fromString(String value) {
		if ("TOKENIZER".equalsIgnoreCase(value))
			return TOKENIZER;
		if ("SENTENCE_DETECTOR".equalsIgnoreCase(value))
			return SENTENCE_DETECTOR;
		if ("POS_TAGGER".equalsIgnoreCase(value))
			return POS_TAGGER;
		if ("CHUNKER".equalsIgnoreCase(value))
			return CHUNKER;
		if ("PARSER".equalsIgnoreCase(value))
			return PARSER;
		if ("LEMMATIZER".equalsIgnoreCase(value))
			return LEMMATIZER;
		if ("DOCUMENT_CATEGORIZER".equalsIgnoreCase(value))
			return DOCUMENT_CATEGORIZER;
		if ("OTHER".equalsIgnoreCase(value))
			return OTHER;

		return OTHER;
	}

}
