# PoliType-

A Java-based console application that helps users understand their political positions through an MBTI-style personality type system, incorporating moral foundation theory to provide deeper insights into political belief formation.

## Overview

This project categorizes political positions using a four-dimensional system, similar to MBTI personality types. It goes beyond simple political labeling by integrating Jonathan Haidt's Moral Foundations Theory to help users understand not just *what* they believe, but *why* they hold these beliefs.

## Features

### 1. Political Type Classification System
Users are assessed across four dimensions to create a political type code (e.g., EPLE, RCAF):

| Dimension | Code | Direction 1 | Direction 2 | Description |
|-----------|------|-------------|-------------|-------------|
| **Economic View** | E/R | **E** (Egalitarianism) - Economic equality, welfare expansion | **R** (Right-Libertarianism) - Market autonomy, free competition | Attitude toward government economic intervention and distribution |
| **Social-Cultural View** | P/C | **P** (Progressivism) - Diversity, change, cultural progress | **C** (Conservatism) - Traditional values, cultural preservation | Attitude toward social norms and cultural change |
| **Authority View** | L/A | **L** (Libertarianism) - Freedom of expression, individual rights | **A** (Authoritarianism) - Order, control, state priority | Perspective on balance between state power and civil liberties |
| **Gender View** | F/E | **F** (Feminist) - Recognition of structural inequality, support for active intervention | **E** (Equalist) - Emphasis on individual equality regardless of gender | Structural vs. individual approach to gender equality |

### 2. Moral Foundation Analysis
Based on Jonathan Haidt and Jesse Graham's Moral Foundations Theory, the application analyzes how users prioritize five universal moral foundations:

- **Care/Harm** - Concern for the suffering of others
- **Fairness/Cheating** - Proportionality and justice
- **Loyalty/Betrayal** - Standing with your group
- **Authority/Subversion** - Respect for tradition and legitimate authority
- **Sanctity/Degradation** - The body is a temple

The key insight: Everyone shares these moral foundations, but we weight them differently - like adjusting an equalizer affects sound quality, adjusting moral weights affects our political intuitions.

### 3. Social Issue Perspective Taking
The application includes exercises to help users understand opposing viewpoints on contemporary social issues, promoting empathy and constructive dialogue across political differences.

## Project Structure

```
src/
├── main/
│   └── Main.java              # Application entry point
├── user/
│   └── User.java              # User data model
├── test/
│   ├── Question.java          # Political assessment questions
│   ├── PoliticalType.java     # Type calculation logic
│   └── ResultPrinter.java     # Results display
├── moral/
│   ├── MoralFoundation.java   # Base moral foundation class
│   ├── EPLE_Moral.java        # Moral profile for each
│   ├── EPLA_Moral.java        # political type combination
│   ├── EPLF_Moral.java        # (20 total combinations)
│   ├── ...                    # 
│   └── RCAF_Moral.java        # 
└── issue/
    └── [Issue discussion modules]
```

## Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Setup
1. Clone the repository:
```bash
git clone https://github.com/yourusername/political-type-assessment.git
cd political-type-assessment
```

2. Compile the project:
```bash
javac -d bin src/**/*.java
```

3. Run the application:
```bash
java -cp bin main.Main
```

## Usage

1. **Start the Assessment**: Launch the application and follow the prompts
2. **Answer Questions**: Respond to questions about economic, social, authority, and gender issues
3. **Receive Your Type**: Get your four-letter political type code (e.g., EPLE)
4. **Explore Moral Foundations**: Learn how your moral priorities shape your political views
5. **Understand Different Perspectives**: Engage with exercises designed to build empathy for other viewpoints

## Example Output

```
Your Political Type: EPLE
- Economic View: Egalitarian (E)
- Social View: Progressive (P)
- Authority View: Libertarian (L)
- Gender View: Equalist (E)

Your Moral Foundation Profile:
Care/Harm: ████████░░ 80%
Fairness: █████████░ 90%
Loyalty: ████░░░░░░ 40%
Authority: ███░░░░░░░ 30%
Sanctity: ██░░░░░░░░ 20%
```

## Educational Purpose

This project aims to:
- Promote self-awareness about political beliefs
- Illustrate that political differences often stem from different moral weightings rather than fundamental disagreements about values
- Encourage constructive dialogue by helping users understand the moral intuitions behind different political positions
- Reduce political polarization through increased understanding

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request. Areas for contribution include:
- Adding more assessment questions
- Expanding the issue discussion modules
- Improving the moral foundation analysis
- Adding visualization features
- Translating to other languages

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Moral Foundations Theory by Jonathan Haidt and Jesse Graham
- Inspired by the MBTI personality assessment framework
- Thanks to all contributors and testers

## Contact

For questions or suggestions, please open an issue in this repository.

---

*Note: This is an educational tool designed to promote understanding and dialogue. Political beliefs are complex and multifaceted - this assessment provides a simplified framework for exploration and discussion.*
