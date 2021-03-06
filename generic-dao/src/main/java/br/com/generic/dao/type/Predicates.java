package br.com.generic.dao.type;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.generic.dao.Parameter;
import br.com.generic.dao.rules.*;


public enum Predicates implements Rule{
	NOT_EQUAL{
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return notEqualRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	GREATER_THAN_OR_EQUAL_TO{
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return greaterThanOrEqualToRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	LESS_THAN_OR_EQUAL_TO{
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return lessThanOrEqualToRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	IN{
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder, Root<T> root, Parameter parameter) {
			return inRule.getPredicate(entityClass, builder, root, parameter);
		}
	},

	NOT_IN{
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder, Root<T> root, Parameter parameter) {
			return notInRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	GREATER_THAN {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return greaterThanRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	LESS_THAN {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return lessThanRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	LIKE {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return likeRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	NOT_LIKE {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return notLikeRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	EQUAL {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return equalRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	IS_NULL {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return isNullRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	IS_NOT_NULL {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return isNotNullRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	BETWEEN {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return betweenRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	IS_MEMBER {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return isMemberRule.getPredicate(entityClass, builder, root, parameter);
		}
	},
	
	IS_NOT_MEMBER {
		@Override
		public <T> Predicate getPredicate(Class<?> entityClass, CriteriaBuilder builder,
				Root<T> root, Parameter parameter) {
			return isNotMemberRule.getPredicate(entityClass, builder, root, parameter);
		}
	};
	
	
	protected Rule notEqualRule = new NotEqualRule();
	protected Rule greaterThanOrEqualToRule = new GreaterThanOrEqualToRule();
	protected Rule lessThanOrEqualToRule = new LessThanOrEqualToRule();
	protected Rule inRule = new InRule();
	protected Rule notInRule = new NotInRule();
	protected Rule greaterThanRule = new GreaterThanRule();
	protected Rule lessThanRule = new LessThanRule();
	protected Rule likeRule = new LikeRule();
	protected Rule equalRule = new EqualRule();
	protected Rule isNullRule = new IsNullRule();
	protected Rule isNotNullRule = new IsNotNullRule();
	protected Rule betweenRule = new BetweenRule();
	protected Rule notLikeRule = new NotLikeRule();
	protected Rule isMemberRule = new IsMemberRule();
	protected Rule isNotMemberRule = new IsNotMemberRule();
	
}
