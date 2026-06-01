---
name: no-model
description: A skill that can only be invoked by the user via /no-model, not by the agent autonomously
disable-model-invocation: true
---

# No-Model Skill

This skill demonstrates disable-model-invocation: true. Because of this flag,
the agent cannot autonomously choose to invoke this skill — it can only be
triggered by the user explicitly typing /no-model.

When invoked, greet the user and explain that this skill required explicit invocation.
